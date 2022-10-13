package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public Connection generaConexion(final String host, final String port, final String db, final String user, final String pass) {

		System.out.println("Entra en generaConexion");
		
        
        Connection conexion = null;
        String url = "";            
        url = "jdbc:postgresql://" + host + ":" + port + "/" + db;
		
        try {
        	
        	
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException cnfe) {
                System.out.println("[ERROR-conexionPostgresql-generaConexion] Error en registro driver PostgreSQL: " + cnfe);
            }
      
            //Conexión a la base de datos en PostgreSQL
            conexion = DriverManager.getConnection(url, user, pass);           
            boolean esValida = conexion.isValid(50000);
            if(esValida == false) {
            	conexion = null;
            }
            System.out.println(esValida ? " Conexión a PostgreSQL correcta" : "Conexión a PostgreSQL no válida");
            return conexion;
            
        } catch (java.sql.SQLException jsqle) {
        	
            System.out.println("Error en conexión a PostgreSQL (" + url + "): " + jsqle);
            return conexion;
            
        }
    }
}
