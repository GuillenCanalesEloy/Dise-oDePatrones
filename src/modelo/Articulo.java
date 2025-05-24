/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Articulo implements ContenidoInformativo{
    private String titulo;

    public Articulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrar() {
        System.out.println("📰 Artículo: " + titulo);
    }
}
