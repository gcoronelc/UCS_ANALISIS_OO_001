package pe.ucs.appventa.prueba;

import pe.ucs.appventa.service.VentaService;

public class Prueba01 {
  
  public static void main(String[] args) {

    // INPUT
    double precio = 467.80;
    int cant = 6;
    
    // Proceso
    VentaService service = new VentaService();
    double dcto = service.calcDcto(precio, cant);
    double total = service.calcTotal(precio, cant);
    double importe = service.calcImporte(total);
    double impuesto = service.calcImpuesto(total);
    
    // OUTPUT
    System.out.println("Descueto: " + dcto);
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
    
  }
 
}
