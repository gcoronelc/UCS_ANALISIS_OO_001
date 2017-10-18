/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

/**
 *
 * @author anibal
 */
public class FabricaDeVehiculos {
     public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory){
  /**Aplicamos Polimorfismo*/
  Vehiculo objetoVehiculo= factory.crearVehiculo();
  objetoVehiculo.codigoDeVehiculo();
 }
}
