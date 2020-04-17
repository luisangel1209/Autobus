package Modelo;

public class ConsultaViaje {
	private String Salida;
	private String Destino;
	private String Fecha;
	
	public ConsultaViaje(String salida, String destino, String fecha) {
		Salida = salida;
		Destino = destino;
		Fecha = fecha;
	}

	public String getSalida() {
		return Salida;
	}

	public void setSalida(String salida) {
		Salida = salida;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
	
	

}
