/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabriel
 */
public class Usuario {
      private int id;
     private String nombre;
    private String rol;
    
    // Constructor para cuando se recupera el usuario desde la BD
    public Usuario(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
    
    
}
