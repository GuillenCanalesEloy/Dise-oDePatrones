/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Reporte;
import java.util.Scanner;

public class RegistroReporte {
    public Reporte procesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese los detalles del reporte:");

        System.out.print("ID del Usuario: ");
        int usuarioId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del Reporte: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción del Reporte: ");
        String descripcion = scanner.nextLine();

        Reporte reporte = new Reporte(usuarioId, nombre, descripcion);
        reporte.registrar();
        return reporte;
    }
}
