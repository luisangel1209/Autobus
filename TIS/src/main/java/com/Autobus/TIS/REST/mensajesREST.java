package com.Autobus.TIS.REST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tis.autobus.ConsultarDestinoResponse;
import com.tis.autobus.SeleccionAutobusResponse;

import Controlador.AsientoViajeDAO;
import Controlador.CompraDAO;
import Controlador.ConsultarViajeDAO;
import Modelo.Asientos;
import Modelo.Clientes;
import Modelo.Compras;
import Modelo.Viajes;

@RestController
public class mensajesREST {
	
	@GetMapping("/rest/viajes")
	public ArrayList<Viajes> viajes() {
		ConsultarViajeDAO consulta = new ConsultarViajeDAO();
		ArrayList<Viajes> lista = consulta.consultViaje2();
		ArrayList<Viajes> listarespuesta = new ArrayList<Viajes>();
		//if(lista.size() != 0) {
			for (Viajes viaje:lista) {
				listarespuesta.add(viaje);
			}

		//}
		return listarespuesta;
	}
	
	@GetMapping("/api/var")
	public ArrayList<Asientos> asientos(@RequestParam(defaultValue = "/?idautobus=")
	int id) {
		AsientoViajeDAO asiento = new AsientoViajeDAO(id);
		ArrayList<Asientos> asientosViaje = asiento.getAsientos();
		ArrayList<Asientos> asientosresp = new ArrayList<Asientos>();
		
			for(Asientos a:asientosViaje) {
				System.out.println(""+a.getEstatus());
				/*String D = "Disponible";
				if(D.equals(a.getEstatus())) {
					temp.setEstatus("Disponible");
				}else {
					temp.setEstatus("Ocupado");
				}*/
				asientosresp.add(a);
			}
		return asientosresp;
	}
	
	@GetMapping("/api/varrr")
	public String boleto(@RequestParam(defaultValue = "/?idViaje=1&idAutobus=1&idAsiento=A3&Pasajero=Mendoza&Correo=mendoza@hotmail.com")
	int viaje, int autobus, String asiento, String nompasa, String correo) {
		String res = null;
		CompraDAO compra = new CompraDAO(viaje, autobus, asiento, nompasa, correo);
		boolean status = compra.getEstatus(asiento, autobus);
		if(status == true) {
			if(compra.realizarCompra()) {
				ConsultarViajeDAO vi = new ConsultarViajeDAO();
				Viajes viajes = vi.getViaje(viaje);
				if(viajes != null) {
					int idBoleto = compra.getGenerarIDBoleto();
					res = "Compra realizada";
					/*respuesta.setIDBoleto(idBoleto);
					respuesta.setSalida(viajes.getOrigen());
					respuesta.setDestino(viajes.getDestino());
					respuesta.setFecha(viajes.getFecha());
					respuesta.setHora(viajes.getHora());
					respuesta.setIDAutobus(viajes.getIDAutobus());
					respuesta.setAsiento(peticion.getIDAsientoSeleccionado());
					respuesta.setNombrePasajero(peticion.getNombrePasajero());
					respuesta.setCorreo(peticion.getCorreo());
					respuesta.setMensajeConfirmacion("Compra Realizada con exito");*/
				}
			}else {
				/*respuesta.setIDBoleto(0);
				respuesta.setSalida("");
				respuesta.setDestino("");
				respuesta.setFecha("");
				respuesta.setHora("");
				respuesta.setIDAutobus(0);
				respuesta.setAsiento("");
				respuesta.setNombrePasajero("");
				respuesta.setCorreo("");
				respuesta.setMensajeConfirmacion("No se pudo realizar la Compra");*/
				res = "No se pudo realizar la compra";
			}
		}else {
			/*respuesta.setIDBoleto(0);
			respuesta.setSalida("");
			respuesta.setDestino("");
			respuesta.setFecha("");
			respuesta.setHora("");
			respuesta.setIDAutobus(0);
			respuesta.setAsiento("");
			respuesta.setNombrePasajero("");
			respuesta.setCorreo("");
			respuesta.setMensajeConfirmacion("Asiento Ocupado: No se pudo realizar la Compra");*/
			res = "Asiento Ocupado: No se pudo realizar la Compra";
			}
		return res;
		}
}
