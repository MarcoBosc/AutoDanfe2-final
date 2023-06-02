package AutoDanfeCadCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPG {
    private static final String url = "jdbc:postgresql://localhost:5432/AutoDanfe2";
    private static final String user = "postgres";
    private static final String password = "admin";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to make connection!");
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
