package Modelo;

public class Viajes {
	private int IDViaje;
	private int IDAutobus;
	private String Origen;
	private String Destino;
	private String Fecha;
	private String Hora;
	private String Precio;
	
	public Viajes(int iDViaje, int iDAutobus, String origen, String destino, String fecha, String hora, String precio) {
		super();
		IDViaje = iDViaje;
		IDAutobus = iDAutobus;
		Origen = origen;
		Destino = destino;
		Fecha = fecha;
		Hora = hora;
		Precio = precio;
	}

	public int getIDViaje() {
		return IDViaje;
	}

	public void setIDViaje(int iDViaje) {
		IDViaje = iDViaje;
	}

	public int getIDAutobus() {
		return IDAutobus;
	}

	public void setIDAutobus(int iDAutobus) {
		IDAutobus = iDAutobus;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
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

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Destino [IDViaje=" + IDViaje + ", IDAutobus=" + IDAutobus + ", Origen=" + Origen + ", Destino="
				+ Destino + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Precio=" + Precio + "]";
	}
	
	
	
	
	
	

	
	
	
	

}
