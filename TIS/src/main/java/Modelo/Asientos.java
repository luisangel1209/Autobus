package Modelo;

import java.sql.Array;
import java.util.ArrayList;

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
	public boolean getEstatus() {
		return Estatus;
	}
	public void setEstatus(boolean estatus2) {
		Estatus = estatus2;
	}
	
	
}
