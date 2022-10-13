package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListaProductos {
	
public static ArrayList<DtoProductos> resultsetAdtoProductos(ResultSet resultadoConsulta){
		
		System.out.println(" Entrando en productos");
		ArrayList<DtoProductos> listaProductos = new ArrayList<>();
		
		//Leemos el resultado
		try {
			while ( resultadoConsulta.next() ) {
				/*his.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.des_producto = des_producto;
		this.fch_alta_producto = fch_alta_producto;
		this.fch_baja_producto = fch_baja_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_clase = tipo_producto_clase;*/
				listaProductos.add(new DtoProductos(resultadoConsulta.getInt("md_uuid"),
						resultadoConsulta.getInt("id_producto"),
						resultadoConsulta.getInt("cod_producto"),
						resultadoConsulta.getInt("tipo_producto_origen"),
						resultadoConsulta.getInt("des_producto"),
						resultadoConsulta.getInt("fch_alta_producto"),
						resultadoConsulta.getInt("fch_baja_producto"),
						 resultadoConsulta.getInt("md_fch"),
						resultadoConsulta.getString("nombre_producto"),
						resultadoConsulta.getString("tipo_producto_clase")));
						
						
						
			}
			
			int i = listaProductos.size();
			System.out.println(" Número productos: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaProductos;
		
	}
}
