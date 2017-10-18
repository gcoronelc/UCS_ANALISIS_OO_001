/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author admin_semag
 */
public class Aplicacion {
    private static int[] myArray = new int[]{10, 11, 8, 4, 1, 9};
   
    public static void main(String[] args) {
        myOrdenador();
        // TODO code application logic here
    }
    public static void myOrdenador(){
        FactoryOrdenacion myFactoryOrdenacion = new FactoryHijoBurbuja () ;
        Ordenador myOrdenador = myFactoryOrdenacion.instancia();
        System.out.println("--------METODOS DE ORDENACION CON PATRONES FACTORY METHOD----------");
        System.out.println("ARREGLO SIN ORDENAR");
        myOrdenador.solucion(myArray);
        myOrdenador.ordenador(myArray);
        System.out.println();
        System.out.println("ARREGLO ORDENAR");
        myOrdenador.solucion(myArray);
        System.out.println();
    }
}
