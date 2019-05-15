package tur.patryk;

import org.springframework.web.client.RestTemplate;

import java.sql.*;

public class SaveDataHydro {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://danepubliczne.imgw.pl/api/data/hydro";
        Hydro[] hydros = restTemplate.getForObject(url, Hydro[].class);

        try (Connection connection = getConnection()) {
            for (Hydro hydro : hydros) {
                System.out.println(hydro);
                addToDataBase(hydro, connection);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

    private static void addToDataBase (Hydro hydro, Connection connection) throws SQLException {

        String sqlQuery = "insert into hydro (id_stacji, stacja, rzeka, województwo, stan_wody, stan_wody_data_pomiaru, " +
        "temperatura_wody, temperatura_wody_data_pomiaru, zjawisko_lodowe, zjawisko_lodowe_data_pomiaru, " +
        "zjawisko_zarastania, zjawisko_zarastania_data_pomiaru) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        preparedStatement.setInt(1, hydro.getIdStacji());
        preparedStatement.setString(2, hydro.getStacja());
        preparedStatement.setString(3, hydro.getRzeka());
        preparedStatement.setString(4, hydro.getWojewodztwo());
        preparedStatement.setInt(5, hydro.getStanWody());
        preparedStatement.setDate(6, hydro.getStanWodyDataPomiaru());
        //preparedStatement.setDate(6, Date.valueOf(hydro.getStanWodyDataPomiaru()));
        preparedStatement.setDouble(7, hydro.getTemperaturaWody());
        preparedStatement.setDate(8, hydro.getTemperaturaWodyDataPomiaru());
        preparedStatement.setInt(9, hydro.getZjawiskoLodowe());
        preparedStatement.setDate(10, hydro.getZjawiskoLodoweDataPomiaru());
        preparedStatement.setInt(11, hydro.getZjawiskoZarastania());
        preparedStatement.setDate(12, hydro.getZjawiskoZarastaniaDataPomiaru());

        preparedStatement.execute();
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "admin";

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
