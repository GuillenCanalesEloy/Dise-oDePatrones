/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import control.FabricaRegistro;
import control.RegistroAccionAmbiental;
import control.RegistroReporte;
import control.SistemaFacade;
import java.util.Scanner;
import modelo.AccionAmbiental;
import modelo.Reporte;

public class SistemaConcientizacionApp {
    public static void main(String[] args) {
         System.out.println("=== Sistema de Concientización Ambiental ===");

        SistemaFacade sistema = new SistemaFacade();

        // Paso 1: Registro
        sistema.registrarAccionYReporte();

        // Paso 2: Contenido Educativo
        sistema.mostrarContenidoEducativo();

        // Paso 3: Gamificación
        sistema.mostrarGamificacion();

        // Podrías clonar después si deseas:
        // sistema.clonarAccionYReporte(accion, reporte); // si guardas los objetos

    }    
}
