package Modelo;

public class Asientos {
	
	private String IDAsiento;
	private int NumeroAsiento;
	private int IDAutobus;
	private String Estatus;
	
	public Asientos(String iDAsiento, int numeroAsiento, int iDAutobus, String estatus) {
		super();
		IDAsiento = iDAsiento;
		NumeroAsiento = numeroAsiento;
		IDAutobus = iDAutobus;
		Estatus = estatus;
	}
	public String getIDAsiento() {
		return IDAsiento;
	}
	public String setIDAsiento(String idAsientos) {
		return IDAsiento = idAsientos;
	}
	public int getNumeroAsiento() {
		return NumeroAsiento;
	}
	public void setNumeroAsiento(int numeroAsiento) {
		NumeroAsiento = numeroAsiento;
	}
	public int getIDAutobus() {
		return IDAutobus;
	}
	public void setIDAutobus(int iDAutobus) {
		IDAutobus = iDAutobus;
	}
	public String getEstatus() {
		return Estatus;
	}
	public void setEstatus(String estatus) {
		Estatus = estatus;
	}
	@Override
	public String toString() {
		return "Asientos [IDAsiento=" + IDAsiento + ", Estatus=" + Estatus + "]";
	}
	
	
	
	
}
