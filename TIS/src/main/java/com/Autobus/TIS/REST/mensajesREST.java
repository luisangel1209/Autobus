package com.Autobus.TIS.REST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tis.autobus.ConsultarDestinoResponse;
import com.tis.autobus.ConsultarViajeResponse;
import com.tis.autobus.ModificarBoletoResponse;
import com.tis.autobus.ConsultarViajeResponse.Viaje;
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
	

	
	@GetMapping("/rest/destinos")
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
	
	@GetMapping("/rest/viajes/{salida}/{destino}/{fecha}")
	public ArrayList<Viaje> consultaviaje(@PathVariable String salida,@PathVariable String destino,@PathVariable String fecha) {	
		System.out.println(""+ salida);
		System.out.println(""+ destino);
		System.out.println(""+ fecha);
		ConsultarViajeDAO consulta = new ConsultarViajeDAO(salida,destino,fecha);
		ArrayList<Viajes> lista = consulta.consultViaje();
		ArrayList<Viaje> listarespuesta = new ArrayList<Viaje>();
		if(lista.size() != 0) {
			for (Viajes viaje:lista) {
				ConsultarViajeResponse.Viaje temp = new ConsultarViajeResponse.Viaje();
				temp.setIDViaje(viaje.getIDViaje());
				temp.setIDAutobus(viaje.getIDAutobus());
				temp.setHora(viaje.getHora());
				temp.setPrecio(viaje.getPrecio());
				temp.setMensaje("Viaje Encontrado");
				listarespuesta.add(temp);
			}
		}
		return listarespuesta;
	}
	
	
	@GetMapping("/rest/asientos/{idautobus}")
	public ArrayList<Asientos> asientos(@PathVariable int idautobus) {
		AsientoViajeDAO asiento = new AsientoViajeDAO(idautobus);
		ArrayList<Asientos> asientosViaje = asiento.getAsientos();
		ArrayList<Asientos> asientosresp = new ArrayList<Asientos>();
		System.out.println(""+ idautobus);
			for(Asientos a:asientosViaje) {
				System.out.println(""+a.getEstatus());
				asientosresp.add(a);
			}
		return asientosresp;
	}
	
	@GetMapping("/rest/modificar/{idboleto}/{idviaje}/{asientoviejo}/{asientonuevo}")
	public String modificar(@PathVariable int idboleto, @PathVariable int idviaje, @PathVariable String asientoviejo, @PathVariable String asientonuevo) {
		String res = null;
		CompraDAO compra = new CompraDAO(idboleto);
		int Boleto = compra.BuscarBoleto(idboleto);
		if(Boleto == idboleto) {
			if(compra.ModificarCompra(idviaje, asientonuevo, asientoviejo)) {
				res = "Boleto Modificado";
			}else {
				res = "No se pudo realizar la modificacion asiento ocupado";
			}
		}else {
			res = "IDBoleto no encontrado";
		}
		return res;
	}
	
	@GetMapping("/rest/eliminar/{idboleto}")
	public String eliminar(@PathVariable int idboleto) {
		String res = null;
		CompraDAO compra = new CompraDAO(idboleto);
		int Boleto = compra.BuscarBoleto(idboleto);
		if(Boleto == idboleto) {
			if(compra.cancelarCompra()) {
				if(compra.cancelarCompra2(compra.cancelarCompra())) {
					res = "Boleto Cancelado";
				}
			}else {
				res = "No se ha podido cancelar el boleto";
			}
		}else {
			res = "IDBoleto no encontrado";
		}
		return res;
	}	
	
	
	@PutMapping("/rest/compra/{idviaje}/{idautobus}/{idasientoseleccionado}/{NombrePasajero}/{correo}")
	public String boleto(@PathVariable int idviaje,@PathVariable int idautobus,@PathVariable String idasientoseleccionado,@PathVariable String NombrePasajero,@PathVariable String correo) {
		String res = null;
		String idboleto = null;
		int bol = 0;
		CompraDAO compra = new CompraDAO(idviaje, idautobus, idasientoseleccionado, NombrePasajero, correo);
		boolean status = compra.getEstatus(idasientoseleccionado, idautobus);
		if(status == true) {
			if(compra.realizarCompra()) {
				ConsultarViajeDAO vi = new ConsultarViajeDAO();
				Viajes viajes = vi.getViaje(idviaje);
				if(viajes != null) {
					int idBoleto = compra.getGenerarIDBoleto();
					bol = idBoleto;
					idboleto= bol+"";
					res = "Compra realizada, tu IDBoleto es: ";
					
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
		return res.concat(idboleto);
		}
}
