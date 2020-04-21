package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexion.ConexionBD;
import Modelo.Asientos;
import Modelo.Viajes;

public class AsientoViajeDAO {

	private ConexionBD conexion;
	private int idAutobus;
	
	public AsientoViajeDAO(int iDAutobus) {
		super();
		idAutobus = iDAutobus;
	}
	
	public AsientoViajeDAO() {
		
	}
	
	public ArrayList<Asientos> getAsientos(){
		
		ArrayList<Asientos> lista = new ArrayList<Asientos>();
		
		ConsultarViajeDAO viaje = new ConsultarViajeDAO();
		
		this.conexion = new ConexionBD();
		
		int iDAutobus = viaje.getIDAutobus(this.idAutobus);
		
		try {
			ResultSet rs = this.conexion.connect().createStatement().executeQuery("SELECT * FROM Asientos WHERE IDAutobus="+ iDAutobus);
			while(rs.next()) {
				lista.add(new Asientos(rs.getString("IDAsiento"), rs.getInt("NumeroAsiento"), rs.getInt("IDAutobus"), rs.getBoolean("Estatus")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;	
	}

	public boolean adquirirAsiento(int idAsiento) {
		boolean resultado = false;
		this.conexion = new ConexionBD();
		try {
			this.conexion.connect().createStatement().execute("UPDATE Asientos SET Estatus='Ocupado' WHERE ID='"+idAsiento+"'");
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
}
