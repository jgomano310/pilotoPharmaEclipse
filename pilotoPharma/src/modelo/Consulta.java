package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Consulta {

public static ArrayList<DtoProductos> SelectProductos(Connection conexionGenerada) {
		
		System.out.println(" Entra en SelectProductos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<DtoProductos> listaProductos = new ArrayList<>();
		
		try {
			
			
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"");
		    
			//Llamada a la conversión a dtoAlumno
			listaProductos = ListaProductos.resultsetAdtoProductos(resultadoConsulta);
			int i = listaProductos.size();
			
			
			System.out.println("Cierre conexióno");				
		    resultadoConsulta.close();
		    declaracionSQL.close();
		    conexionGenerada.close();
			
		} catch (SQLException e) {
			
			System.out.println("Error generando la declaracionSQL: " + e);
			return listaProductos;
			
		}
		return listaProductos;
		
	}
}
