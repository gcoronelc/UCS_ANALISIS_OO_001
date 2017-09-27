package pe.ucs.app.prueba;

import pe.ucs.app.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    int n1 = 12;
    int n2 = 18;
    int n3 = 13;
    int n4 = 19;
    int n5 = 14;
    
    // Proceso
    MateService service = new MateService();
    int s2 = service.sumar(n1, n2);
    int s3 = service.sumar(n1, n2, n3);
    int s4 = service.sumar(n1, n2, n3, n4);
    int s5 = service.sumar(n1, n2, n3, n4, n5);
    
    // Reporte
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);
    System.out.println("s4: " + s4);
    System.out.println("s5: " + s5);
    
  }
}
