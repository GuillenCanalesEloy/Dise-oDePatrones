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
import java.util.Date;

public class ContenidoDAO {
    public void insertarContenido(String tipo, String titulo, String url, Date fecha, int usuarioId) {
    try {
        Connection con = ConexionBD.getInstancia().getConexion();
        CallableStatement stmt = con.prepareCall("CALL sp_insertar_contenido(?, ?, ?, ?, ?)");
        stmt.setString(1, tipo);
        stmt.setString(2, titulo);
        stmt.setString(3, url);
        stmt.setDate(4, new java.sql.Date(fecha.getTime()));
        stmt.setInt(5, usuarioId);
        stmt.execute();
        System.out.println("📚 Contenido guardado con URL.");
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}
