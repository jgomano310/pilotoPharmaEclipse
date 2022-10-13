package controlador;

import java.sql.Connection;
import java.util.ArrayList;

import Util.variables;
import modelo.Conexion;
import modelo.Consulta;
import modelo.DtoProductos;

public class ControladorExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final String HOST = variables.getHost();
		final String PORT = variables.getPort();
		final String DB = variables.getDb();
		final String USER = variables.getUser();
		final String PASS = variables.getPass();
		ArrayList<DtoProductos> listaProductos = new ArrayList<>();

		
		// generamos la conexión a PostgreSQL
		
		System.out.println("Lamada generaConexion");
		Conexion conexionPostgresql = new Conexion();
		Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
		
		if(conexionGenerada != null) {
			
			//no funciona el foreach
			System.out.println(" Lamada selectproductos");
			listaProductos = Consulta.SelectProductos(conexionGenerada);
			int i = listaProductos.size();
			
			for(DtoProductos asign : listaProductos)
            {
                System.out.println(asign.toString());
                
            

            }
	}

}
}
