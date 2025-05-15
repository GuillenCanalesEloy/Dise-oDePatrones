/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import baseDatos.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;

public class Reporte implements Cloneable {
    private Date fecha;
    private int idAccion;
    private String observaciones;

    public Reporte(Date fecha, int idAccion, String observaciones) {
        this.fecha = fecha;
        this.idAccion = idAccion;
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
 
    public void registrar() {
        try {
            Connection con = ConexionBD.getInstancia().getConexion();
            CallableStatement stmt = con.prepareCall("CALL sp_insertar_reporte(?, ?, ?)");
            stmt.setInt(1, idAccion);
            stmt.setDate(2, new java.sql.Date(fecha.getTime()));
            stmt.setString(3, observaciones);
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
