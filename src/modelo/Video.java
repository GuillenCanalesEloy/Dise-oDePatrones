/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Video implements ContenidoInformativo{
    private String titulo;

    public Video(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrar() {
        System.out.println("🎥 Video: " + titulo);
    }
}
