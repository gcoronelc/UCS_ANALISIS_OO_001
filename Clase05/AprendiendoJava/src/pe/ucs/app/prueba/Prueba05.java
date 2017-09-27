package pe.ucs.app.prueba;

public class Prueba05 {

  private static String nombre = "Gustavo";
  
  static {
    nombre = "Claudia";
  }
  
  public static void main(String[] args) {
    
    System.out.println(nombre);
    
  }
}
