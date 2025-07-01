//prueba2
package modelo;

import baseDatos.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;

public class Reporte implements Cloneable {
    private int usuarioId;
    private String nombre;
    private String descripcion;

    public Reporte(int usuarioId, String nombre, String descripcion) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para registrar con el procedimiento actualizado
    public void registrar() {
        try {
            Connection con = ConexionBD.getInstancia().getConexion();
            CallableStatement stmt = con.prepareCall("CALL sp_insertar_reporte(?, ?, ?)");
            stmt.setInt(1, usuarioId);
            stmt.setString(2, nombre);
            stmt.setString(3, descripcion);
            stmt.execute();
            System.out.println("✅ Reporte registrado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reporte clone() {
        try {
            return (Reporte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
