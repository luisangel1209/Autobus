package Modelo;

public class Compras {

	
	private int idBoleto;
	private int NumeroCliente;
	private int idViaje;
	private String idAsiento;
	private boolean estatus;
	
	public Compras() {
		
	}
	
	public Compras(int idBoleto, int numeroCliente, int idViaje, String idAsiento, boolean estatus) {
		super();
		this.idBoleto = idBoleto;
		this.NumeroCliente = numeroCliente;
		this.idViaje = idViaje;
		this.idAsiento = idAsiento;
		this.estatus = estatus;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public int getNumeroCliente() {
		return NumeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		NumeroCliente = numeroCliente;
	}

	public int getIdAutobus() {
		return idViaje;
	}

	public void setIdAutobus(int idAutobus) {
		this.idViaje = idAutobus;
	}

	public String getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(String idAsiento) {
		this.idAsiento = idAsiento;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
}
