package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.ConexionBD;

public class ClienteDAO {
	
	private String nombre;
	private String correo;
	private ConexionBD conexion;
	
	public ClienteDAO(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	public boolean AltaCliente() {
		boolean resultado = false;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute("INSERT INTO Clientes(NumeroCliente,Nombre,Correo) VALUES (NULL,'"+this.nombre+"','"+this.correo+"')");
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
}
