/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.*;
import java.util.Date;
import java.util.Scanner;

public class SistemaFacade implements ISistema {
    private Scanner scanner = new Scanner(System.in);
   
    private AccionAmbiental ultimaAccion;
    private Reporte ultimoReporte;

    public void registrarAccionYReporte() {
    RegistroAccionAmbiental regAccion = new RegistroAccionAmbiental();
    ultimaAccion = regAccion.procesar();

    RegistroReporte regReporte = new RegistroReporte();
    ultimoReporte = regReporte.procesar();
    }

public void clonarAccionYReporte() {
    if (ultimaAccion == null || ultimoReporte == null) {
        System.out.println("⚠️ No hay acción o reporte para clonar.");
        return;
    }

    System.out.println("\n🔁 Clonando acción y reporte...");

    AccionAmbiental clonAccion = ultimaAccion.clone();
    clonAccion.setTipoAccion("Clon: " + ultimaAccion.getTipoAccion());
    clonAccion.setDescripcion("Clonación automática");
    clonAccion.ejecutar();

    Reporte clonReporte = ultimoReporte.clone();
    clonReporte.setFecha(new java.util.Date());
    clonReporte.setObservaciones("Clonación automática del reporte");
    clonReporte.registrar();
    }


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

    public void mostrarGamificacion() {
        System.out.print("Nombre del logro: ");
        String nombre = scanner.nextLine();

        System.out.print("Recompensa del logro: ");
        String recompensa = scanner.nextLine();
        
        
    }
}
