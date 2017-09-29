package jc_mvc_demo;

import controller.controlador;
import model.modelo;
import view.vista;
/**
*  @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class Main {
    
    public static void main(String[] args) {

        //nuevas instancias de clase
        modelo modelo = new modelo();
        vista vista = new vista();        
        controlador controlador = new controlador( vista , modelo );
        //se inicia la vista
        controlador.iniciar_vista();

        vista.setVisible(true);

    }

}
