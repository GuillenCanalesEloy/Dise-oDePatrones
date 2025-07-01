/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JOptionPane;
import modelo.*;
import modelo.LogroDAO;
import java.util.Date;

public class SistemaReal implements ISistema {
    private Usuario usuarioActual;
   private AccionAmbiental ultimaAccion;
private Reporte ultimoReporte;


public SistemaReal(Usuario usuario) {
    this.usuarioActual = usuario;
}

    @Override
    public void registrarAccionYReporte() {
        
        JOptionPane.showMessageDialog(null, "✅ Acción y reporte registrados en el sistema real.");
    }

    @Override
    public void clonarAccionYReporte() {
 
        JOptionPane.showMessageDialog(null, "🔁 Acción y reporte clonados correctamente.");
    }

    @Override
    public void mostrarContenidoEducativo() {
        String tituloArticulo = JOptionPane.showInputDialog(null, "Título del artículo:");
    String tituloVideo = JOptionPane.showInputDialog(null, "Título del video:");

    Articulo art = new Articulo(tituloArticulo);
    Video vid = new Video(tituloVideo);

    PaqueteContenido paquete = new PaqueteContenido();
    paquete.agregar(art);
    paquete.agregar(vid);
    paquete.mostrar();

    ContenidoDAO dao = new ContenidoDAO();
    Date fechaHoy = new Date();

    dao.insertarContenido("Articulo", tituloArticulo, fechaHoy, usuarioActual.getId());
    dao.insertarContenido("Video", tituloVideo, fechaHoy, usuarioActual.getId());

    JOptionPane.showMessageDialog(null, "📥 Contenido educativo registrado en la base de datos.");
}

    @Override
    public void mostrarGamificacion() {
    // Pedimos el tipo de acción realizada al usuario
    String tipoAccion = JOptionPane.showInputDialog(null, "¿Qué tipo de acción realizaste?\n(Ej: Reciclaje, Plantación de árboles, Limpieza de playas)");

    int puntos;
    switch (tipoAccion.toLowerCase()) {
        case "reciclaje":
            puntos = 30;
            break;
        case "plantacion de arboles":
            puntos = 50;
            break;
        case "limpieza de playas":
            puntos = 70;
            break;
        default:
            puntos = 20;
    }

    String nombre = "EcoHéroe del Día";
    String recompensa = puntos + " puntos ecológicos";

    // Crear logro decorado
    ILogro logro = new LogroBasico(nombre);
    ILogro logroConRecompensa = new LogroConRecompensa(logro, recompensa);

    // Mostrar por consola
    logroConRecompensa.mostrar();

    // Guardar en base de datos
    LogroDAO dao = new LogroDAO();
    dao.insertarLogro(nombre, recompensa, usuarioActual.getId());

    // Mostrar mensaje final
    JOptionPane.showMessageDialog(null, "🎉 Logro registrado: " + nombre + "\nRecompensa: " + recompensa);
}
}
