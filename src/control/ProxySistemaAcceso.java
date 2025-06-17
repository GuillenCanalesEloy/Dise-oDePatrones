/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author gabriel
 */
public class ProxySistemaAcceso implements ISistema {
    private String rolUsuario;
    private ISistema sistemaReal;

    public ProxySistemaAcceso(String rolUsuario, ISistema sistemaReal) {
        this.rolUsuario = rolUsuario;
        this.sistemaReal = sistemaReal;
    }

    @Override
    public void registrarAccionYReporte() {
        if (rolUsuario.equals("Administrador") || rolUsuario.equals("Conductor") || rolUsuario.equals("Pasajero")) {
            sistemaReal.registrarAccionYReporte();
        } else {
            accesoDenegado("registrarAccionYReporte");
        }
    }

    @Override
    public void clonarAccionYReporte() {
        if (rolUsuario.equals("Administrador") || rolUsuario.equals("Conductor")) {
            sistemaReal.clonarAccionYReporte();
        } else {
            accesoDenegado("clonarAccionYReporte");
        }
    }

    @Override
    public void mostrarContenidoEducativo() {
        if (rolUsuario.equals("Administrador") || rolUsuario.equals("Conductor") || rolUsuario.equals("Pasajero")) {
            sistemaReal.mostrarContenidoEducativo();
        } else {
            accesoDenegado("mostrarContenidoEducativo");
        }
    }

    @Override
    public void mostrarGamificacion() {
        if (rolUsuario.equals("Administrador")) {
            sistemaReal.mostrarGamificacion();
        } else {
            accesoDenegado("mostrarGamificacion");
        }
    }

    private void accesoDenegado(String metodo) {
        System.out.println("⛔ Acceso denegado al método: " + metodo + " para el rol: " + rolUsuario);
    }
}
