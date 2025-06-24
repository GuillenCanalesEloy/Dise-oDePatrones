/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabriel
 */
import baseDatos.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;

public class LogroDAO {
    public void insertarLogro(String nombre, String recompensa, int usuarioId) {
        try {
            Connection con = ConexionBD.getInstancia().getConexion();
            CallableStatement stmt = con.prepareCall("CALL sp_insertar_logro(?, ?, ?)");
            stmt.setString(1, nombre);
            stmt.setString(2, recompensa);
            stmt.setInt(3, usuarioId);
            stmt.execute();
            System.out.println("🏆 Logro guardado en la base de datos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
}