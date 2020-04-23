package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.ConexionBD;
import Modelo.Compras;


public class CompraDAO {
	private int idViaje;
	private int idAutobus;
	private String idAsiento;
	private String NombrePasajero;
	private String NuevoNombrePasajero;
	private String Correo;
	private ConexionBD conexion;
	private int idBoleto;
	
	public CompraDAO(int iDBoleto) {
		this.idBoleto = iDBoleto;
	}
	
	public CompraDAO(int iDBoleto, String nuevonombrepasajero) {
		this.idBoleto = iDBoleto;
		this.NuevoNombrePasajero = nuevonombrepasajero;
	}

	public CompraDAO(int idViaje, int idAutobus, String idAsiento, String nombrePasajero, String correo) {
		super();
		this.idViaje = idViaje;
		this.idAutobus = idAutobus;
		this.idAsiento = idAsiento;
		this.NombrePasajero = nombrePasajero;
		this.Correo = correo;
	}
	
	public boolean realizarCompra() {
		boolean resultado = false;
		this.conexion = new ConexionBD();
		AsientoViajeDAO asiento = new AsientoViajeDAO();
		ClienteDAO cliente = new ClienteDAO(this.NombrePasajero,this.Correo);
		boolean resultAsiento = asiento.adquirirAsiento(idAsiento);
		
		if(resultAsiento) {
			boolean resultadoCliente = cliente.AltaCliente();
			if(resultadoCliente) {
				int numeroCliente = cliente.getNumCliente();
				String sql = "INSERT INTO Compras(IDBoleto,NumeroCliente,IDViaje,Estatus,IDAsiento) VALUES(NULL,'"+numeroCliente+"','"+this.idViaje+"',true,'"+this.idAsiento+"')";
				try {
					this.conexion.connect().createStatement().execute(sql);
					resultado = true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return resultado;
	}
	
	public boolean ModificarCompra() {
		boolean resultado = false;
		ClienteDAO cliente = new ClienteDAO(this.idBoleto);
		int numerocliente = cliente.getNumCliente2();
		String sql = "UPDATE Clientes SET Nombre='"+this.NuevoNombrePasajero+"' WHERE NumeroCliente="+numerocliente;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute(sql);
			resultado=true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resultado;
	}
	
	public int getGenerarIDBoleto() {
		
		int idBoleto = 0;
		ClienteDAO cliente = new ClienteDAO(this.NombrePasajero,this.Correo);
		int numeroCliente = cliente.getNumCliente();
		this.conexion = new ConexionBD();
		String sql = "SELECT IDBoleto FROM Compras WHERE NumeroCliente="+numeroCliente+" AND IDViaje="+this.idViaje;
		
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery(sql);
			
			if(rs.next()) {
				idBoleto = rs.getInt("IDBoleto");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idBoleto;
	}
	
	public boolean cancelarCompra() {
		boolean resultado = false;
		String sql = "UPDATE Compras SET ESTATUS=FALSE WHERE IDBoleto="+this.idBoleto;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute(sql);
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	public boolean cancelarCompra2(boolean estatus2) {
		String estatus = "Disponible";
		boolean resultado = false;
		CompraDAO compra = new CompraDAO(this.idBoleto);
		String boleto = compra.getCompra().getIdAsiento();
		String sql2 = "UPDATE Asientos SET Estatus='"+estatus+"' WHERE IDAsiento=('"+boleto+"')";
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute(sql2);
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	public Compras getCompra() {
		Compras compra = null;
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT * FROM Compras WHERE IDBoleto="+this.idBoleto);
			if(rs.next()) {
				compra = new Compras(rs.getInt("IDBoleto"),rs.getInt("NumeroCliente"),rs.getInt("IDViaje"),rs.getString("IDAsiento"),rs.getBoolean("Estatus"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compra;
	}
	
	public String getEstatus(String asientoseleccionado) {
		String asiento = asientoseleccionado;
		String estatus = "";
		this.conexion = new ConexionBD();
		String sql = "SELECT Estatus FROM Asientos WHERE IDAsiento=('"+asiento+"')";
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery(sql);
			if(rs.next()) {
				estatus = rs.getString("Estatus");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}
	
}
