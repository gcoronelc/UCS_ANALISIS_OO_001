package pe.ucs.appventa.service;

public class VentaService {
  
  public double calcDcto(double precio, int cant){
    // Variable
    double dcto;
    // Proceso
    dcto = 0.0;
    if( cant >= 6 ){
      dcto = precio * 0.05;
    }
    // Retorno
    return dosDec(dcto);
  }
  
  public double calcTotal(double precio, int cant){
    // Variable
    double total;
    // Proceso
    double dcto = calcDcto(precio, cant);
    total = (precio - dcto) * cant;
    // Retorno
    return dosDec(total);
  }
  
  public double calcImporte( double total){
    // Variable
    double importe;
    // Proceso
    importe = total / 1.18;
    // Retorno
    return dosDec(importe);
  }
  
  public double calcImpuesto(double total){
    // Variable
    double impuesto;
    // Proceso
    impuesto = total - calcImporte(total);
    // Retorno
    return dosDec(impuesto);
  }
  
  
  public double dosDec(double num){
    num *= 100;
    num = Math.round(num);
    num /= 100;
    return num;
  }
}
