/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author admin_semag
 */
public class FactoryHijoBurbuja extends FactoryOrdenacion {
    public FactoryHijoBurbuja(){
        
    }
    @Override
    public Ordenador instancia(){
        return new OrdenadorBurbuja();
    }
}
