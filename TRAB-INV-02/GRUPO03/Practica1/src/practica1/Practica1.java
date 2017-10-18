
package practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        juegos_de_video();
    }
    
    public static void juegos_de_video(){
        Scanner in = new Scanner(System.in);
        String nombre, publico, clasificacion;
        double precio, total ;
        System.out.println("Clasificador de juegos de video");
        System.out.println("Ingrese el titulo del juego");
        nombre = in.next();
        System.out.println("Ingrese quienes pueden jugar: niños, jovenes, mayores de edad, adultos");
        publico = in.next();
        System.out.println("Ingrese el precio del juego");
        precio=in.nextDouble();
        metodos met = new metodos();
        clasificacion = met.clasificacion(publico);
        total= met.precioenvio(precio);
        System.out.println("");
        System.out.println("************************");
        
        System.out.println("titulo: " + nombre);
        System.out.println("clasificacion: " + clasificacion);
        System.out.println("precio total: "+total);
        System.out.println("************************");
    }
    
}
