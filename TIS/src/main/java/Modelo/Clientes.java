package Modelo;

public class Clientes {

	private int numero;
	private String nombre;
	private String correo;
	
	public Clientes() {
	}

	public Clientes(int numero, String nombre, String correo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.correo = correo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

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
	
	
}
