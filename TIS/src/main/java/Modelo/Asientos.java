package Modelo;

public class Asientos {
	
	private String IDAsiento;
	private int NumeroAsiento;
	private int IDAutobus;
	private boolean Estatus;
	
	public Asientos(String iDAsiento, int numeroAsiento, int iDAutobus, boolean estatus) {
		super();
		IDAsiento = iDAsiento;
		NumeroAsiento = numeroAsiento;
		IDAutobus = iDAutobus;
		Estatus = estatus;
	}
	public String getIDAsiento() {
		return IDAsiento;
	}
	public void setIDAsiento(String iDAsiento) {
		IDAsiento = iDAsiento;
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
	public boolean getEstatus() {
		return Estatus;
	}
	public void setEstatus(boolean estatus) {
		Estatus = estatus;
	}
	
	
}
