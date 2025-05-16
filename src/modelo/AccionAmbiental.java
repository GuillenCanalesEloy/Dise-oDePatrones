/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
//prueba 1
import baseDatos.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;

public class AccionAmbiental implements Cloneable {
    private int usuarioId;
    private String tipoAccion;
    private String descripcion;

    public AccionAmbiental(int usuarioId, String tipoAccion, String descripcion) {
        this.usuarioId = usuarioId;
        this.tipoAccion = tipoAccion;
        this.descripcion = descripcion;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void ejecutar() {
        try {
            Connection con = ConexionBD.getInstancia().getConexion();
            CallableStatement stmt = con.prepareCall("CALL sp_insertar_accion_ambiental(?, ?, ?)");
            stmt.setInt(1, usuarioId);
            stmt.setString(2, tipoAccion);
            stmt.setString(3, descripcion);
            stmt.execute();
            System.out.println("✅ Acción ambiental registrada correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public AccionAmbiental clone() {
        try {
            return (AccionAmbiental) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // No debería ocurrir
        }
    } 
}

