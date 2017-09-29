package model;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 * En esta clase se guarda la lógica del sistema, para este sencillo ejemplo
 * consiste en una SUMA
 */
public class modelo {
    //Variables
    private int valor1=28;
    private int valor2=69;
    private int total = sumar();

    public modelo(){}

    public void set_valor1(int val){
        this.valor1=val;
    }

    public int get_valor1(){
        return this.valor1;
    }

    public void set_valor2(int val){
        this.valor2=val;
    }

    public int get_valor2(){
        return this.valor2;
    }

    public int sumar(){
        this.total =  this.valor1 + this.valor2;
        return this.total;
    }

    public int get_total(){
        return this.total;
    }

}
