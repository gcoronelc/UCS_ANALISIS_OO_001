package pe.ucs.app.model;

public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    this.nombre = "Arroz";
    this.precio = 4.50;
    this.stock = 1000;
    this.activo = true;
  }

  /**
   * Constructor con parámetros.
   * @param nombre Nombre del producto.
   * @param precio Precio de venta.
   * @param stock Stock en almacen.
   * @param activo Si esta disponible para la venta.
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }
  
  
  
}
