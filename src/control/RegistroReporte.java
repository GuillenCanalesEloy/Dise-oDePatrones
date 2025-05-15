/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Reporte;
import java.util.Date;
import java.util.Scanner;

public class RegistroReporte {
    public Reporte procesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese los detalles del reporte:");

        System.out.print("ID de la Acción: ");
        int idAccion = Integer.parseInt(scanner.nextLine());

        System.out.print("Descripción del Reporte: ");
        String descripcion = scanner.nextLine();

        Date fecha = new Date(); // Fecha actual
        Reporte reporte = new Reporte(fecha, idAccion, descripcion);
        reporte.registrar();
        return reporte;
    }
}
