/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author gabriel
 */
import java.util.ArrayList;
import java.util.List;

public class GestorEventos {
    private static GestorEventos instancia;
    private List<Observador> observadores = new ArrayList<>();

    private GestorEventos() {}

    public static GestorEventos getInstancia() {
        if (instancia == null) {
            instancia = new GestorEventos();
        }
        return instancia;
    }

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void notificar(String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }
}
