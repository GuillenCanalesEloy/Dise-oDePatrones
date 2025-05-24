/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.*;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class SistemaFacade {
    private Scanner scanner = new Scanner(System.in);

    public void registrarAccionYReporte() {
        RegistroAccionAmbiental regAccion = new RegistroAccionAmbiental();
        AccionAmbiental accion = regAccion.procesar();

        RegistroReporte regReporte = new RegistroReporte();
        Reporte reporte = regReporte.procesar();
    }

    public void clonarAccionYReporte(AccionAmbiental accion, Reporte reporte) {
        AccionAmbiental clonAccion = accion.clone();
        clonAccion.setTipoAccion("Clon: " + accion.getTipoAccion());
        clonAccion.setDescripcion("Clonación automática");
        clonAccion.ejecutar();

        Reporte clonReporte = reporte.clone();
        clonReporte.setFecha(new Date());
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

        ILogro logro = new LogroBasico(nombre);
        ILogro logroDecorado = new LogroConRecompensa(logro, recompensa);
        logroDecorado.mostrar();
    }
}
