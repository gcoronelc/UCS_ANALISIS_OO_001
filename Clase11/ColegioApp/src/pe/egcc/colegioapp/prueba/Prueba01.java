package pe.egcc.colegioapp.prueba;

import pe.egcc.colegioapp.model.Empleado;
import pe.egcc.colegioapp.service.LogonService;

public class Prueba01 {

  public static void main(String[] args) {
    try {
      
      // Datos
      String usuario = "gustavo";
      String clave = "gustavo";
      
      // Proceso
      LogonService service = new LogonService();
      Empleado bean = service.validarUsuario(usuario, clave);
      
      // Reporte
      System.out.println("Hola: " + bean.getNombre());
      
    } catch (Exception e) {
      
      System.err.println(e.getMessage());
      
    }
    
    
  }

  
}
