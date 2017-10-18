package pe.egcc.colegioapp.model;

public class Empleado {

  private int idempleado;
  private String apellido;
  private String nombre;
  private String email;
  private String telefono;
  private int idrol;

  public Empleado() {
  }

  public int getIdempleado() {
    return idempleado;
  }

  public void setIdempleado(int idempleado) {
    this.idempleado = idempleado;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public int getIdrol() {
    return idrol;
  }

  public void setIdrol(int idrol) {
    this.idrol = idrol;
  }

}
