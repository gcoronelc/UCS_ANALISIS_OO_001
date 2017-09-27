package pe.ucs.app.prueba;

import pe.ucs.app.model.ProductoModel;

public class Prueba02 {

  public static void main(String[] args) {
    
    ProductoModel model = new ProductoModel("Televisor", 4000.0);
    
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("Precio: " + model.getPrecio());
    
    modificar(model);
    
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("Precio: " + model.getPrecio());
  }

  private static void modificar(ProductoModel model) {
    model.setNombre("Refrigeradora");
    model.setPrecio(5600.0);
  }
  
}
