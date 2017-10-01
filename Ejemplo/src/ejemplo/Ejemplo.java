
package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejemplo {

    
    public static void main(String[] args) {
      Connection conexion;
       String url="jdbc:mysql://localhost:3306/marcador";
       String usuario="root";
       String clave="mysql2017";
        try {
            conexion= DriverManager.getConnection(url,usuario,clave);
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
}
