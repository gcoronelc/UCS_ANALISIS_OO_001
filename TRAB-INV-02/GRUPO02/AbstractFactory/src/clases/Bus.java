/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.Vehiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author anibal
 */
public class Bus implements Vehiculo {

  private int codigo;

  public int generarCodigo() {
    int codigoBus = (int) (Math.random() * 9999);
    return codigoBus;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void codigoDeVehiculo() {
    JOptionPane.showMessageDialog(null, "El Codigo del Bus es : " + getCodigo());
    

    }
}
