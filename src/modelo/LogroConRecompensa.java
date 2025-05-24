/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class LogroConRecompensa implements ILogro{
     private ILogro logroBase;
    private String recompensa;

    public LogroConRecompensa(ILogro logroBase, String recompensa) {
        this.logroBase = logroBase;
        this.recompensa = recompensa;
    }

    @Override
    public void mostrar() {
        logroBase.mostrar();
        System.out.println("🎁 Recompensa: " + recompensa);
    }
}

