package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	Connection conexion = null;
	
	public String driver = "com.mysql.jdbc.Driver";
	public String database =  "Vuelos";
	public String hostname = "18.234.73.61";
	public String port = "3306";
	public String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	public String username = "luisangel12";
	public String password = "garcia12luis";
	
	public Connection connect() {
			try {
				this.conexion = DriverManager.getConnection(this.url,this.username,this.password);
				System.out.println("Conexion establecida");
			} catch (SQLException e) {
				System.out.println("Conexion Fallida!:\n" + e.getCause());
			}
		return this.conexion;
	}
}
