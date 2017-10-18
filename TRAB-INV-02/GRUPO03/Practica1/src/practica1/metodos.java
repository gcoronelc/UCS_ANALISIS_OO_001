
package practica1;


public class metodos {
    
    public String clasificacion (String tipo){
        
        String  clasisifacion = "";
        if (tipo.equals("niños")) {
            clasisifacion="E todo el publico";
        } else if(tipo.equals("jovenes")) {
            clasisifacion="T adolecentes";
        } else if (tipo.equals("mayores de edad")){
            clasisifacion="M maduro";
        } else if (tipo.equals("adultos")){
            clasisifacion="A adultos";
        }else{
            clasisifacion="RP pendiente";
        }
        
        return clasisifacion;
    }
    
    public double precioenvio(double precio){
        double costo, impuesto, ganancia;
        impuesto = precio * 0.12;
        ganancia = precio * 0.21;
        
        costo = precio + impuesto + ganancia;
        
        return costo;
    }
    
}
