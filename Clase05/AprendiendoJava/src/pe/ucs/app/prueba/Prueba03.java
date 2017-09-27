package pe.ucs.app.prueba;

public class Prueba03 {

  public static void main(String[] args) {
    String nombre = "Gustavo";
    
    System.out.println("Nombre: " + nombre);
    
    modificar(nombre);
    
    System.out.println("Nombre: " + nombre);
    
  }

  private static void modificar(String nombre) {
    nombre = "Claudia";
  }
  
}
