/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import control.FabricaRegistro;
import control.RegistroAccionAmbiental;
import control.RegistroReporte;
import modelo.AccionAmbiental;
import modelo.Reporte;

public class SistemaConcientizacionApp {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Concientización Ambiental ===");

        RegistroAccionAmbiental registroAccion = (RegistroAccionAmbiental) FabricaRegistro.crearRegistro("AccionAmbiental");
        AccionAmbiental accion = registroAccion.procesar();

        RegistroReporte registroReporte = (RegistroReporte) FabricaRegistro.crearRegistro("Reporte");
        Reporte reporte = registroReporte.procesar();

        // Clonando la acción ambiental...
        System.out.println("\nClonando la acción ambiental...");
        AccionAmbiental accionClonada = accion.clone();
        System.out.println("✅ Acción clonada: " + accionClonada);

        // Ahora actualizo el clon y lo guardo
        accionClonada.setTipoAccion("Acción clonada: " + accion.getTipoAccion());
        accionClonada.setDescripcion("Clonación de la acción original.");
        accionClonada.ejecutar(); // Guardar el clon en MySQL
        System.out.println("✅ Acción clonada registrada correctamente.");

        // Clonando el reporte...
       System.out.println("\nClonando el reporte...");
       Reporte reporteClonado = reporte.clone();
       System.out.println("✅ Reporte clonado: " + reporteClonado);

       // Ahora actualizo el clon y lo guardo
      reporteClonado.setObservaciones("Clonación del reporte original.");
      reporteClonado.setFecha(new java.util.Date());
      reporteClonado.registrar(); // Guardar el clon en MySQL
      System.out.println("✅ Reporte clonado registrado correctamente.");

    }
}
