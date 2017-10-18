package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Empleado;

public class LogonService {
  
  
  public Empleado validarUsuario(String usuario, String clave){
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select e.idempleado,e.apellido,"
              + "e.nombre,e.email,e.telefono,"
              + "u.idrol from empleado e "
              + "join usuario u "
              + "on e.idempleado = u.idempleado "
              + "where u.usuario = ? "
              + "and clave = SHA(?) ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if(rs.next()){
        bean = new Empleado();
        bean.setApellido(rs.getString("apellido"));
        bean.setNombre(rs.getString("nombre"));
        bean.setEmail(rs.getString("email"));
        bean.setTelefono(rs.getString("telefono"));
        bean.setIdempleado(rs.getInt("idempleado"));
        bean.setIdrol(rs.getInt("idrol"));
      }
      rs.close();
      pstm.close();
      if( bean ==  null){
        throw new Exception("Datos incorrectos");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("Datos incorrectos.");
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }
  
}
