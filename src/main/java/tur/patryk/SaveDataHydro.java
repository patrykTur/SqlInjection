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

    private static void addToDataBase(Hydro hydro, Connection connection) throws SQLException {

        String sqlQuery = "insert into hydro (id_stacji, stacja, rzeka, województwo, stan_wody, stan_wody_data_pomiaru, " +
                "temperatura_wody, temperatura_wody_data_pomiaru, zjawisko_lodowe, zjawisko_lodowe_data_pomiaru, " +
                "zjawisko_zarastania, zjawisko_zarastania_data_pomiaru) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        CheckNull.intOrNull(preparedStatement, 1, hydro.getIdStacji());
        CheckNull.stringOrNull(preparedStatement, 2, hydro.getStacja());
        CheckNull.stringOrNull(preparedStatement, 3, hydro.getRzeka());
        CheckNull.stringOrNull(preparedStatement, 4, hydro.getWojewodztwo());
        CheckNull.intOrNull(preparedStatement, 5, hydro.getStanWody());
        CheckNull.dateOrNull(preparedStatement, 6, hydro.getStanWodyDataPomiaru());
        CheckNull.doubleOrNull(preparedStatement, 7, hydro.getTemperaturaWody());
        CheckNull.dateOrNull(preparedStatement, 8, hydro.getTemperaturaWodyDataPomiaru());
        CheckNull.intOrNull(preparedStatement, 9, hydro.getZjawiskoLodowe());
        CheckNull.dateOrNull(preparedStatement, 10, hydro.getZjawiskoLodoweDataPomiaru());
        CheckNull.intOrNull(preparedStatement, 11, hydro.getZjawiskoZarastania());
        CheckNull.dateOrNull(preparedStatement, 12, hydro.getZjawiskoZarastaniaDataPomiaru());

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
