/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.AccionAmbiental;
import java.util.Scanner;

public class RegistroAccionAmbiental {
    public AccionAmbiental procesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese los detalles de la acción ambiental:");
        
        System.out.print("Tipo de Acción: ");
        String tipoAccion = scanner.nextLine();
        
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        
        System.out.print("ID de Usuario: ");
        int usuarioId = Integer.parseInt(scanner.nextLine());

        AccionAmbiental accion = new AccionAmbiental(usuarioId, tipoAccion, descripcion);
        accion.ejecutar();
        return accion;
        //prueba 1
    }
}
