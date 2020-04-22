package Modelo;

public class Compras {

	
	private int idBoleto;
	private String NombreCliente;
	private int idAutobus;
	private int idAsiento;
	private boolean estatus;
	
	public Compras() {
		
	}
	
	public Compras(int idBoleto, String nombreCliente, int idAutobus, int idAsiento, boolean estatus) {
		super();
		this.idBoleto = idBoleto;
		this.NombreCliente = nombreCliente;
		this.idAutobus = idAutobus;
		this.idAsiento = idAsiento;
		this.estatus = estatus;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	public int getIdAutobus() {
		return idAutobus;
	}

	public void setIdAutobus(int idAutobus) {
		this.idAutobus = idAutobus;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
}
