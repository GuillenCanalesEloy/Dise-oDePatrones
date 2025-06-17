/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class SistemaReal implements ISistema {

    @Override
    public void registrarAccionYReporte() {
        // Aquí va la lógica real, puedes ajustar más adelante
        JOptionPane.showMessageDialog(null, "✅ Acción y reporte registrados en el sistema real.");
    }

    @Override
    public void clonarAccionYReporte() {
        JOptionPane.showMessageDialog(null, "🔁 Acción y reporte clonados correctamente.");
    }

    @Override
    public void mostrarContenidoEducativo() {
        JOptionPane.showMessageDialog(null, "📚 Mostrando contenido educativo: artículos, videos...");
    }

    @Override
    public void mostrarGamificacion() {
        JOptionPane.showMessageDialog(null, "🎮 Mostrando logros, puntos y recompensas.");
    }
}
