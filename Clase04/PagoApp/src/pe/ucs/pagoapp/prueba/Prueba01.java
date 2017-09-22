package pe.ucs.pagoapp.prueba;

import pe.ucs.pagoapp.model.PagoModel;
import pe.ucs.pagoapp.service.PagoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    PagoModel model = new PagoModel(6, 20, 90.0);
    
    // Proceso
    PagoService service = new PagoService();
    model = service.procesarPago(model);
    
    // Reporte
    System.out.println("INPUT");
    System.out.println("Horas por día: " + model.getHorasDia());
    System.out.println("Días trabajados: " + model.getDias());
    System.out.println("Pago po hora: " + model.getPagoHora());
    System.out.println("OUTPUT");
    System.out.println("Ingresos: " + model.getIngresos());
    System.out.println("Renta: " + model.getRenta());
    System.out.println("Neto: " + model.getNeto());
  }
  
}
