/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.colegioapp.controller;

import pe.egcc.colegioapp.service.LogonService;

/**
 *
 * @author DOCENTE
 */
public class LogonController {

  public void validar(String usuario, String clave) {
  
    LogonService service = new LogonService();
    service.validarUsuario(usuario, clave);
    
    // Manejo de sesiones
    
  
  }
  
}
