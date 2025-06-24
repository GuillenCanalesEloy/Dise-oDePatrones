/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author gabriel
 */
public class RegistrarContenidoCommand implements IComando {
    private ISistema sistema;

    public RegistrarContenidoCommand(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void ejecutar() {
        sistema.mostrarContenidoEducativo();
    }
}