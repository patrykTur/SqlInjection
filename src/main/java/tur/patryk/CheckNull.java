package tur.patryk;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;

public class CheckNull {

    public static void intOrNull(PreparedStatement preparedStatement, int column, Integer value) {
        try {
            if (value != null) {
                preparedStatement.setInt(column, value);
            } else {
                preparedStatement.setNull(column, Types.INTEGER);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void stringOrNull(PreparedStatement preparedStatement, int column, String value) {
        try {
            if (value != null) {
                preparedStatement.setString(column, value);
            } else {
                preparedStatement.setNull(column, Types.VARCHAR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void doubleOrNull(PreparedStatement preparedStatement, int column, Double value) throws SQLException {
            if (value != null) {
                preparedStatement.setDouble(column, value);
            } else {
                preparedStatement.setNull(column, Types.NUMERIC);
            }
    }

    public static void dateOrNull(PreparedStatement preparedStatement, int column, LocalDateTime value) {
        try {
            if (value != null) {
                preparedStatement.setDate(column, DateConverter.localDateTime2SqlDate(value));
            } else {
                preparedStatement.setNull(column, Types.DATE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
