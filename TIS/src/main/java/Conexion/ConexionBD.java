package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	Connection conexion = null;

	String database =  "Vuelos";
	String hostname = "18.234.73.61";
	String port = "3306";
	String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	String username = "luisangel12";
	String password = "garcia12luis";
	
	public Connection connect() {
		
		try {
			this.conexion = DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("Conexion Fallida!:\n" + e.getMessage());
		}

		if (conexion != null) {
			System.out.println("Conexion establecida");
		} else {
			System.out.println("No se pudo establecer conexion");
		}
		
		return this.conexion;
		
	}

}
