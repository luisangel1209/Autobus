package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.ConexionBD;

public class ClienteDAO {
	
	private String nombre;
	private String correo;
	private int idBoleto;
	private ConexionBD conexion;
	
	public ClienteDAO(int IDBoleto) {
		this.idBoleto = IDBoleto;
	}
	
	public ClienteDAO(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	public boolean AltaCliente() {
		boolean resultado = false;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute("INSERT INTO Clientes(NumeroCliente,Nombre,Correo,Contra) VALUES (NULL,'"+this.nombre+"','"+this.correo+"', NULL)");
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	return resultado;	
	}

	public int getNumCliente() {
		int resultado = 0;
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT NumeroCliente FROM Clientes WHERE Correo='"+this.correo+"'");
			if(rs.next()) {
				resultado = rs.getInt("NumeroCliente");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	public int getNumCliente2() {
		int resultado = 0;
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT NumeroCliente FROM Compras WHERE IDBoleto='"+this.idBoleto+"'");
			if(rs.next()) {
				resultado = rs.getInt("NumeroCliente");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
}
