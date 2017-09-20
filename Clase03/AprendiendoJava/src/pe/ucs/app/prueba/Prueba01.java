package pe.ucs.app.prueba;

import pe.ucs.app.model.Producto;

public class Prueba01 {

  public static void main(String[] args) {
    
    Producto obj = new Producto();
    
    mostrar(obj);
    
    
    Producto obj2 = new Producto("Carro", 15000.0, 10, true);
    
    mostrar(obj2);
    
  }

  private static void mostrar(Producto obj) {
    System.out.println("----------------");
    System.out.println("Nombre: " + obj.getNombre());
    System.out.println("Precio: " + obj.getPrecio());
    System.out.println("Stock: " + obj.getStock());
    System.out.println("Activo: " + obj.isActivo());
  }
  
}
