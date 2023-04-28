
public class Persona {
	
	String nombre; 
	String correo; 
	String pedido;
	
	//Constructor 
	public Persona(String nombre, String correo, String pedido) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.pedido = pedido;
	}

	//Getters and Setters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	} 
	
}//Ultimo
