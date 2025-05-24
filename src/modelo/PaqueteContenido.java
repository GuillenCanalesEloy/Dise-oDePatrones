/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabriel
 */
import java.util.ArrayList;
import java.util.List;

public class PaqueteContenido implements ContenidoInformativo {
    private List<ContenidoInformativo> contenidos = new ArrayList<>();

    public void agregar(ContenidoInformativo contenido) {
        contenidos.add(contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("📚 Mostrando paquete de contenidos:");
        for (ContenidoInformativo c : contenidos) {
            c.mostrar();
        }
    }
}