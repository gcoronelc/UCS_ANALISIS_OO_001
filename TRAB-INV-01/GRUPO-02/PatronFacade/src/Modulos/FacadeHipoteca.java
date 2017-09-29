/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

/**
 *
 * @author Luis
 */
public class FacadeHipoteca {
    public boolean esFiable(Cliente c){
        if((new Banco().tieneFondos(c) && (new Credito().historialCorrecto(c)) && (new Prestamo().tienePrestamo(c)))){
            System.out.println("El cliente obtuvo el prestamo");
            return true;
        }
        else {
            System.out.println("El cliente no obtuvo el prestamo");
            return false;
        }
    }
}
