
package gym;

import java.sql.*;

public class ConexionUsuario {

    public static void crearTablaSiNoExiste() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nombre VARCHAR(50), " +
                     "peso DOUBLE, " +
                     "fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP" +
                     ")";
        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void guardarUsuario(String nombre, String contraseña, double peso) {
        String sql = "INSERT INTO usuarios (nombre, contraseña,peso) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, contraseña);
            stmt.setDouble(3, peso);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarPeso(String nombre, double nuevoPeso) {
        String sql = "UPDATE usuarios SET peso = ? WHERE nombre = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, nuevoPeso);
            stmt.setString(2, nombre);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
