/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

public class FabricaRegistro {
    public static Object crearRegistro(String tipo) {
        switch (tipo) {
            case "AccionAmbiental":
                return new RegistroAccionAmbiental();
            case "Reporte":
                return new RegistroReporte();
            default:
                throw new IllegalArgumentException("Tipo de registro no soportado: " + tipo);
        }
    }
}
