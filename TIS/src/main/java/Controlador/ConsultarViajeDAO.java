package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.ConexionBD;
import Modelo.Viajes;


public class ConsultarViajeDAO {

	private String Origen;
	private String Destino;
	private String Fecha;
	private ConexionBD conexion;

	public ConsultarViajeDAO(String origen, String destino, String fecha) {
		Origen = origen;
		Destino = destino;
		Fecha = fecha;
	}
	
	public ArrayList<Viajes> consultViaje() {
		
		
		ArrayList<Viajes> viaje = new ArrayList<Viajes>(); 
		ArrayList<Viajes> viajesAceptados = new ArrayList<Viajes>();
		
		
		this.conexion = new ConexionBD();
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT IDAutobus, Hora, Precio FROM Viajes WHERE Fecha='"+this.Fecha+"'");
			while(rs.next()) {
				viaje.add(new Viajes(rs.getInt("IDViaje"), rs.getInt("IDAutobus"), rs.getString("Origen"), rs.getString("Destino"), rs.getString("Fecha"), rs.getString("Hora"), rs.getString("Precio")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Viajes v:viaje) {
			String auxOrigen = v.getOrigen();
			String auxDestino = v.getDestino();
			if((auxOrigen.indexOf(this.Origen)!= -1)&&(auxDestino.indexOf(this.Destino)!= -1)){
				
				viajesAceptados.add(new Viajes(v.getIDViaje(), v.getIDAutobus(), v.getOrigen(), v.getDestino(), v.getFecha(), v.getHora(), v.getPrecio()));
			}
		}
		return viajesAceptados;	
	}
}