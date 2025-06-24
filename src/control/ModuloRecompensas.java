/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author gabriel
 */

import modelo.ILogro;
import modelo.LogroBasico;
import modelo.LogroConRecompensa;

public class ModuloRecompensas implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Nueva acción] " + mensaje);
        System.out.println("[Recompensas] Se actualizó los puntos por " + mensaje.toLowerCase());

    }
}
