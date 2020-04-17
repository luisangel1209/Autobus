package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import Conexion.ConexionBD;
import Modelo.ConsultaViaje;

public class ConsultarViajeDAO {
	private String Salida;
	private String Destino;
	private String Fecha;
	
	private ConexionBD conexion;

	public ConsultarViajeDAO(String salida, String destino, String fecha) {
		super();
		Salida = salida;
		Destino = destino;
		Fecha = fecha;
	}
	
	public ConsultaViaje consultarReservacion(int id) {
		ConsultaViaje consulta = null;
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT * FROM reservaciones WHERE idReservacion="+id);
			while(rs.next()) {
				consulta = new ConsultaViaje(((ConsultaViaje) rs).getSalida(), ((ConsultaViaje) rs).getDestino(), ((ConsultaViaje) rs).getFecha());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return consulta;
	}
	
}