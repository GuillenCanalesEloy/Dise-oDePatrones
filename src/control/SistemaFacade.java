/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import modelo.*;
import java.util.Scanner;

public class SistemaFacade implements ISistema {
    private Scanner scanner = new Scanner(System.in);
   
    private AccionAmbiental ultimaAccion;
    private Reporte ultimoReporte;

    @Override
    public void registrarAccionYReporte() {
        // Registrar Acción Ambiental
        RegistroAccionAmbiental regAccion = new RegistroAccionAmbiental();
        ultimaAccion = regAccion.procesar();

        // Registrar Reporte
        System.out.println("\nIngrese los detalles del reporte:");

        int usuarioId = ultimaAccion.getUsuarioId(); // Usamos mismo usuario que creó la acción
        System.out.print("Nombre del Reporte: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción del Reporte: ");
        String descripcion = scanner.nextLine();

        Reporte reporte = new Reporte(usuarioId, nombre, descripcion);
        reporte.registrar();

        ultimoReporte = reporte;
    }

    @Override
    public void clonarAccionYReporte() {
        if (ultimaAccion == null || ultimoReporte == null) {
            System.out.println("⚠️ No hay acción o reporte para clonar.");
            return;
        }

        System.out.println("\n🔁 Clonando acción y reporte...");

        // Clonar acción
        AccionAmbiental clonAccion = ultimaAccion.clone();
        clonAccion.setTipoAccion("Clon: " + ultimaAccion.getTipoAccion());
        clonAccion.setDescripcion("Clonación automática");
        clonAccion.ejecutar();

        // Clonar reporte
        Reporte clonReporte = ultimoReporte.clone();
        clonReporte.setNombre("Clon: " + ultimoReporte.getNombre());
        clonReporte.setDescripcion("Clonación automática");
        clonReporte.registrar();
    }

    @Override
    public void mostrarContenidoEducativo() {
        System.out.print("Título del artículo: ");
        String tituloArticulo = scanner.nextLine();

        System.out.print("Título del video: ");
        String tituloVideo = scanner.nextLine();

        Articulo art = new Articulo(tituloArticulo);
        Video vid = new Video(tituloVideo);

        PaqueteContenido paquete = new PaqueteContenido();
        paquete.agregar(art);
        paquete.agregar(vid);
        paquete.mostrar();
    }

    @Override
    public void mostrarGamificacion() {
        System.out.print("Nombre del logro: ");
        String nombre = scanner.nextLine();

        System.out.print("Recompensa del logro: ");
        String recompensa = scanner.nextLine();

        System.out.println("🏆 Logro registrado: " + nombre + " con recompensa " + recompensa);
    }
}
