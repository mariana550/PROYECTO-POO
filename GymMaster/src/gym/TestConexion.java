package gym; // o el paquete en que estés trabajando

import java.sql.Connection;

public class TestConexion {

    public static void main(String[] args) {
        Connection conn = ConexionBD.conectar();
        if (conn != null) {
            System.out.println("✅ Conexión exitosa a la base de datos");
        } else {
            System.out.println("❌ Falló la conexión");
        }
    }
}