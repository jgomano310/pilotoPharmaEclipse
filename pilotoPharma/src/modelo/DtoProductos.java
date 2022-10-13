package modelo;

public class DtoProductos {
	
	
	
	public int getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(int md_uuid) {
		this.md_uuid = md_uuid;
	}
	public int getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(int md_fch) {
		this.md_fch = md_fch;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}
	public int getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public void setTipo_producto_origen(int tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}
	public int getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(int des_producto) {
		this.des_producto = des_producto;
	}
	public int getFch_alta_producto() {
		return fch_alta_producto;
	}
	public void setFch_alta_producto(int fch_alta_producto) {
		this.fch_alta_producto = fch_alta_producto;
	}
	public int getFch_baja_producto() {
		return fch_baja_producto;
	}
	public void setFch_baja_producto(int fch_baja_producto) {
		this.fch_baja_producto = fch_baja_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}
	
	
	
	
	int md_uuid;
	public DtoProductos(int md_uuid, int id_producto, int cod_producto, int tipo_producto_origen, int des_producto,
			int fch_alta_producto, int fch_baja_producto, int md_fch, String nombre_producto,
			String tipo_producto_clase) {
		super();
		this.md_uuid = md_uuid;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.des_producto = des_producto;
		this.fch_alta_producto = fch_alta_producto;
		this.fch_baja_producto = fch_baja_producto;
		this.md_fch = md_fch;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_clase = tipo_producto_clase;
	}




	int id_producto;
	int cod_producto;
	int tipo_producto_origen;
	int des_producto;
	int fch_alta_producto;
	int fch_baja_producto;
	int md_fch;
	String nombre_producto;
	String tipo_producto_clase;
	

	
	
	

	
	
}
