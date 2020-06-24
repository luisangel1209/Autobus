package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.ConexionBD;
import Modelo.Compras;


public class CompraDAO {
	private int idViaje;
	private int idAutobus;
	private String idAsiento;
	private String NombrePasajero;
	private String Correo;
	private ConexionBD conexion;
	private int idBoleto;
	
	public CompraDAO(int iDBoleto) {
		this.idBoleto = iDBoleto;
	}
	
	public CompraDAO(String Nombre, String Correo) {
		this.NombrePasajero = Nombre;
		this.Correo = Correo;
	}

	public CompraDAO(int idViaje, int idAutobus, String idAsiento, String nombrePasajero, String correo) {
		super();
		this.idViaje = idViaje;
		this.idAutobus = idAutobus;
		this.idAsiento = idAsiento;
		this.NombrePasajero = nombrePasajero;
		this.Correo = correo;
	}
	
	public CompraDAO() {
	}

	public boolean realizarCompra() {
		boolean resultado = false;
		this.conexion = new ConexionBD();
		AsientoViajeDAO asiento = new AsientoViajeDAO();
		ClienteDAO cliente = new ClienteDAO(this.NombrePasajero,this.Correo);
		boolean resultAsiento = asiento.adquirirAsiento(idAsiento, idAutobus);
		
		if(resultAsiento) {
			boolean resultadoCliente = cliente.AltaCliente(this.Correo);
			if(resultadoCliente) {
				int numeroCliente = cliente.getNumCliente();
				String sql = "INSERT INTO Compras(IDBoleto,NumeroCliente,IDViaje,Estatus,IDAsiento,NombrePasajero) VALUES(NULL,'"+numeroCliente+"','"+this.idViaje+"','"+1+"','"+this.idAsiento+"', '"+this.NombrePasajero+"')";
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
	
	public boolean ModificarCompra(int idviaje, String nuevoid, String viejoid) {
		boolean resultado = false;
		ClienteDAO cliente = new ClienteDAO(this.idBoleto);
		int numerocliente = cliente.getNumCliente2();
		if(getEstatus2(nuevoid)) {
			if(cancelarAsiento(idviaje,nuevoid,viejoid)) {
				String sql = "UPDATE Compras SET IDAsiento='"+nuevoid+"' WHERE IDBoleto="+this.idBoleto+" AND Estatus="+1+" AND NumeroCliente="+numerocliente;
				this.conexion = new ConexionBD();
				try {
					this.conexion.connect().createStatement().execute(sql);
					resultado=true;
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}else {
				return resultado;
			}
		}else {
			return resultado;
		}
		
		return resultado;
	}
	
	public boolean cancelarAsiento(int idviaje, String nuevoid, String viejoid) {
		String estatuso = "Ocupado";
		String estatus = "Disponible";
		boolean resultado = false;
		String sql = "UPDATE Asientos SET Estatus='"+estatuso+"' WHERE IDAsiento='"+nuevoid+"' AND IDAutobus="+idviaje;
		String sql2 = "UPDATE Asientos SET Estatus='"+estatus+"' WHERE IDAsiento='"+viejoid+"' AND IDAutobus="+idviaje;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute(sql);
			this.conexion.connect().createStatement().execute(sql2);
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	public int BuscarBoleto(int Idboleto) {
		int boleto = 0;
		this.conexion = new ConexionBD();
		String sql = "SELECT IDBoleto FROM Compras WHERE IDBoleto="+Idboleto;
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery(sql);
			if(rs.next()) {
				boleto = rs.getInt("IDBoleto");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return boleto;
	}
	
	public int getGenerarIDBoleto() {
		System.out.println(""+this.idAsiento);
		int estatus = 1;
		int idBoleto = 0;
		ClienteDAO cliente = new ClienteDAO(this.NombrePasajero,this.Correo);
		int numeroCliente = cliente.getNumCliente();
		this.conexion = new ConexionBD();
		String sql = "SELECT * FROM Compras WHERE NumeroCliente="+numeroCliente+" AND IDViaje="+this.idViaje+" AND IDAsiento='"+this.idAsiento+"' AND Estatus="+estatus;
		
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
		String sql = "UPDATE Compras SET ESTATUS="+0+" WHERE IDBoleto="+this.idBoleto;
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
		int viaje = compra.getCompra().getIdAutobus();
		String sql2 = "UPDATE Asientos SET Estatus='"+estatus+"' WHERE IDAsiento=('"+boleto+"') AND IDAutobus="+viaje;
		
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
	
	public ArrayList<Compras> getCompra2() {
		ArrayList<Compras> lista = new ArrayList<Compras>();
		ClienteDAO viaje = new ClienteDAO(this.NombrePasajero, this.Correo);
		int numerocliente = viaje.getNumCliente3();
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT * FROM Compras WHERE Estatus="+1+" AND NumeroCliente="+numerocliente);
			while(rs.next()) {
				lista.add(new Compras(rs.getInt("IDBoleto"),rs.getInt("NumeroCliente"),rs.getInt("IDViaje"),rs.getString("IDAsiento"),rs.getBoolean("Estatus")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public boolean getEstatus(String asientoseleccionado, int autobus) {
		int bus = autobus;
		String asiento = asientoseleccionado;
		boolean estatus = false;
		String estatus2 = "";
		String estatus3 = "Disponible";
		this.conexion = new ConexionBD();
		String sql = "SELECT Estatus FROM Asientos WHERE IDAsiento=('"+asiento+"') AND IDAutobus="+this.idAutobus;
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery(sql);
			if(rs.next()) {
				estatus2 = rs.getString("Estatus");
				System.out.println(estatus2);
				if(estatus3.equals(estatus2)) {
					estatus = true;
				}
			}
			//estatus = true;
			//if(rs.next()) {
				//estatus = rs.getString("Estatus");
			//}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}
	
	public boolean getEstatus2(String asientoseleccionado) {
		String asiento = asientoseleccionado;
		boolean estatus = false;
		String estatus2 = "";
		String estatus3 = "Disponible";
		this.conexion = new ConexionBD();
		String sql = "SELECT Estatus FROM Asientos WHERE IDAsiento=('"+asiento+"')";
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery(sql);
			if(rs.next()) {
				estatus2 = rs.getString("Estatus");
				System.out.println(estatus2);
				if(estatus3.equals(estatus2)) {
					estatus = true;
				}
			}
			//estatus = true;
			//if(rs.next()) {
				//estatus = rs.getString("Estatus");
			//}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}
}
