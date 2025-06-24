/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabriel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReceptorAccion {

    public void registrar(AccionAmbiental accion, int usuarioId) {
        System.out.println("🌱 Acción registrada: " + accion.getTipoAccion() + " - " + accion.getDescripcion());

        // Guardado directo en BD sin DAO
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/CambioClimatico", "clima_use", "Clima12!"
            );
            String sql = "INSERT INTO AccionAmbiental (usuarioId, tipoAccion, descripcion) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuarioId);
            stmt.setString(2, accion.getTipoAccion());
            stmt.setString(3, accion.getDescripcion());
            stmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error al registrar acción: " + e.getMessage());
        }
    }
}