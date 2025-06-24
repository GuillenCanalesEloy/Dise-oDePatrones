/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author gabriel
 */
import modelo.AccionAmbiental;
import modelo.ReceptorAccion;

public class ComandoRegistrarAccion implements ComandoAccion {
    private ReceptorAccion receptor;
    private AccionAmbiental accion;
    private int usuarioId;

    public ComandoRegistrarAccion(ReceptorAccion receptor, AccionAmbiental accion, int usuarioId) {
        this.receptor = receptor;
        this.accion = accion;
        this.usuarioId = usuarioId;
    }

    @Override
    public void ejecutar() {
        receptor.registrar(accion, usuarioId);
    }
}
