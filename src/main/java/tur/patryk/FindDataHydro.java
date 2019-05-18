package tur.patryk;

import java.sql.*;
import java.util.Scanner;

public class FindDataHydro {

    public static void main(String[] args) {

        System.out.print("Podaj nazwę szukanej stacji: ");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        try (Connection connection = getConnection()) {
            Hydro hydro = findByStacja(connection, input);
            System.out.println(hydro);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Hydro findByStacja (Connection connection, String input) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("select id_stacji, stacja, rzeka, województwo, stan_wody, stan_wody_data_pomiaru, temperatura_wody, " +
                "temperatura_wody_data_pomiaru, zjawisko_lodowe, zjawisko_lodowe_data_pomiaru, zjawisko_zarastania, zjawisko_zarastania_data_pomiaru from hydro where stacja = ?;");

        preparedStatement.setString(1, input);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(!resultSet.next()) {
            return null;
        }

        Hydro hydro = new Hydro();

        hydro.setIdStacji(resultSet.getInt("id_stacji"));
        hydro.setStacja(resultSet.getString("stacja"));
        hydro.setRzeka(resultSet.getString("rzeka"));
        hydro.setWojewodztwo(resultSet.getString("województwo"));
<<<<<<< HEAD
        hydro.setStanWody(resultSet.getString("stan_wody"));
        hydro.setStanWodyDataPomiaru(resultSet.getString("stan_wody_data_pomiaru"));
        hydro.setTemperaturaWody(resultSet.getString("temperatura_wody"));
        hydro.setTemperaturaWodyDataPomiaru(resultSet.getString("temperatura_wody_data_pomiaru"));
        hydro.setZjawiskoLodowe(resultSet.getString("zjawisko_lodowe"));
        hydro.setZjawiskoLodoweDataPomiaru(resultSet.getString("zjawisko_lodowe_data_pomiaru"));
        hydro.setZjawiskoZarastania(resultSet.getString("zjawisko_zarastania"));
        hydro.setZjawiskoZarastaniaDataPomiaru(resultSet.getString("zjawisko_zarastania_data_pomiaru"));
=======
        hydro.setStanWody(resultSet.getInt("stan_wody"));
        hydro.setStanWodyDataPomiaru(DateConverter.sqlDate2LocalDateTime(resultSet.getDate("stan_wody_data_pomiaru")));
        hydro.setTemperaturaWody(resultSet.getDouble("temperatura_wody"));
        hydro.setTemperaturaWodyDataPomiaru(DateConverter.sqlDate2LocalDateTime(resultSet.getDate("temperatura_wody_data_pomiaru")));
        hydro.setZjawiskoLodowe(resultSet.getInt("zjawisko_lodowe"));
        hydro.setZjawiskoLodoweDataPomiaru(DateConverter.sqlDate2LocalDateTime(resultSet.getDate("zjawisko_lodowe_data_pomiaru")));
        hydro.setZjawiskoZarastania(resultSet.getInt("zjawisko_zarastania"));
        hydro.setZjawiskoZarastaniaDataPomiaru(DateConverter.sqlDate2LocalDateTime(resultSet.getDate("zjawisko_zarastania_data_pomiaru")));
>>>>>>> Add DateConverter and CheckNull class

        return hydro;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "admin";

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
