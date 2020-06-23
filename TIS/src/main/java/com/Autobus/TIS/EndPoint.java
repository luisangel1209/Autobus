package com.Autobus.TIS;


import java.util.ArrayList;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.tis.autobus.CancelarBoletoRequest;
import com.tis.autobus.CancelarBoletoResponse;
import com.tis.autobus.ConsultarDestinoRequest;
import com.tis.autobus.ConsultarDestinoResponse;
import com.tis.autobus.SeleccionAsientoResponse;
import com.tis.autobus.ConsultarViajeRequest;
import com.tis.autobus.ConsultarViajeResponse;
import com.tis.autobus.MisViajesRequest;
import com.tis.autobus.MisViajesResponse;
import com.tis.autobus.ModificarBoletoRequest;
import com.tis.autobus.ModificarBoletoResponse;
import com.tis.autobus.SeleccionAsientoRequest;
import com.tis.autobus.SeleccionAutobusRequest;
import com.tis.autobus.SeleccionAutobusResponse;

import Controlador.AsientoViajeDAO;
import Controlador.ClienteDAO;
import Controlador.CompraDAO;
import Controlador.ConsultarViajeDAO;
import Modelo.Viajes;
import Modelo.Asientos;
import Modelo.Compras;


@Endpoint
public class EndPoint {
	
	/**
	 * Metodo para consultar la informacion de una viaje
	 * @param peticion
	 * @return
	 * @throws ClassNotFoundException 
	 */
@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConsultarDestinoRequest")
	
	@ResponsePayload
	public ConsultarDestinoResponse getConsultaDestino(@RequestPayload ConsultarDestinoRequest peticion){
		ConsultarDestinoResponse respuesta = new ConsultarDestinoResponse();
		
		ConsultarViajeDAO consulta = new ConsultarViajeDAO();
		ArrayList<Viajes> lista = consulta.consultViaje2();
		ArrayList<ConsultarDestinoResponse.Viajes> listarespuesta = new ArrayList<ConsultarDestinoResponse.Viajes>();
		
		if(lista.size() != 0) {
			for (Viajes viaje:lista) {
				ConsultarDestinoResponse.Viajes temp = new ConsultarDestinoResponse.Viajes();
				temp.setSalida(viaje.getOrigen());
				temp.setDestino(viaje.getDestino());
				listarespuesta.add(temp);
			}
			respuesta.getViajes().addAll(listarespuesta);
		}
		return respuesta;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConsultarViajeRequest")
	
	@ResponsePayload
	public ConsultarViajeResponse getConsultaViaje(@RequestPayload ConsultarViajeRequest peticion){
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();
		
		ConsultarViajeDAO consulta = new ConsultarViajeDAO(peticion.getSalida(),peticion.getDestino(),peticion.getFecha());
		ArrayList<Viajes> lista = consulta.consultViaje();
		ArrayList<ConsultarViajeResponse.Viaje> listarespuesta = new ArrayList<ConsultarViajeResponse.Viaje>();
		
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
			respuesta.getViaje().addAll(listarespuesta);
		}
		return respuesta;
	}
	
	
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAutobusRequest")
	@ResponsePayload
	public SeleccionAutobusResponse getSeleccionAutobus(@RequestPayload SeleccionAutobusRequest peticion1){
		SeleccionAutobusResponse respuesta = new SeleccionAutobusResponse();
		AsientoViajeDAO asiento = new AsientoViajeDAO(peticion1.getIDSeleccion());
		ArrayList<Asientos> asientosViaje = asiento.getAsientos();
		ArrayList<SeleccionAutobusResponse.Asiento> asientosresp = new ArrayList<SeleccionAutobusResponse.Asiento>();
		
		if(asientosViaje.size() != 0) {
			for(Asientos a:asientosViaje) {
				SeleccionAutobusResponse.Asiento temp = new SeleccionAutobusResponse.Asiento();
				temp.setIdAsiento(a.getIDAsiento());
				System.out.println(""+a.getEstatus());
				String D = "Disponible";
				if(D.equals(a.getEstatus())) {
					temp.setEstatus("Disponible");
				}else {
					temp.setEstatus("Ocupado");
				}
				asientosresp.add(temp);
			}
			respuesta.getAsiento().addAll(asientosresp);
		}else {
		}
		return respuesta;
	}
	
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="MisViajesRequest")
	@ResponsePayload
	public MisViajesResponse getMisViajes(@RequestPayload MisViajesRequest peticion) {
		MisViajesResponse respuesta = new MisViajesResponse();
		CompraDAO com = new CompraDAO(peticion.getNombreIngresadoEnLaCompra(), peticion.getCorreoIngresadoEnLaCompra());
		ArrayList<Compras> compras = com.getCompra2();
		ArrayList<MisViajesResponse.MisViajes> listarespuesta = new ArrayList<MisViajesResponse.MisViajes>();
		if(compras.size() != 0) {
			for(Compras c:compras) {
				MisViajesResponse.MisViajes temp = new MisViajesResponse.MisViajes();
				temp.setIDBoleto(c.getIdBoleto());
				temp.setIDViaje(c.idViaje);
				temp.setIDAsiento(c.getIdAsiento());
				listarespuesta.add(temp);
			}
			respuesta.getMisViajes().addAll(listarespuesta);
		}else {
			MisViajesResponse.MisViajes temp = new MisViajesResponse.MisViajes();
			temp.setIDBoleto(0);
			temp.setIDViaje(0);
			temp.setIDAsiento("Sin Viajes Hasta el Momento");
			listarespuesta.add(temp);
			respuesta.getMisViajes().addAll(listarespuesta);
		}
		return respuesta;
	}
	

	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAsientoRequest")
	@ResponsePayload
	public SeleccionAsientoResponse getConfirmar(@RequestPayload SeleccionAsientoRequest peticion){
		SeleccionAsientoResponse respuesta = new SeleccionAsientoResponse();
		CompraDAO compra = new CompraDAO(peticion.getIDViaje(), peticion.getIDAutobus(), peticion.getIDAsientoSeleccionado(), peticion.getNombrePasajero(), peticion.getCorreo());
		boolean status = compra.getEstatus(peticion.getIDAsientoSeleccionado(), peticion.getIDAutobus());
		System.out.println("Hola"+ status);
		if(status == true) {
			System.out.println("Hola");
			if(compra.realizarCompra()) {
				ConsultarViajeDAO vi = new ConsultarViajeDAO();
				Viajes viajes = vi.getViaje(peticion.getIDViaje());
				if(viajes != null) {
					int idBoleto = compra.getGenerarIDBoleto();
					respuesta.setIDBoleto(idBoleto);
					respuesta.setSalida(viajes.getOrigen());
					respuesta.setDestino(viajes.getDestino());
					respuesta.setFecha(viajes.getFecha());
					respuesta.setHora(viajes.getHora());
					respuesta.setIDAutobus(viajes.getIDAutobus());
					respuesta.setAsiento(peticion.getIDAsientoSeleccionado());
					respuesta.setNombrePasajero(peticion.getNombrePasajero());
					respuesta.setCorreo(peticion.getCorreo());
					respuesta.setMensajeConfirmacion("Compra Realizada con exito");
				}
			}else {
				respuesta.setIDBoleto(0);
				respuesta.setSalida("");
				respuesta.setDestino("");
				respuesta.setFecha("");
				respuesta.setHora("");
				respuesta.setIDAutobus(0);
				respuesta.setAsiento("");
				respuesta.setNombrePasajero("");
				respuesta.setCorreo("");
				respuesta.setMensajeConfirmacion("No se pudo realizar la Compra");
			}
		}else {
			respuesta.setIDBoleto(0);
			respuesta.setSalida("");
			respuesta.setDestino("");
			respuesta.setFecha("");
			respuesta.setHora("");
			respuesta.setIDAutobus(0);
			respuesta.setAsiento("");
			respuesta.setNombrePasajero("");
			respuesta.setCorreo("");
			respuesta.setMensajeConfirmacion("Asiento Ocupado: No se pudo realizar la Compra");	
		}
		return respuesta;
	}

	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ModificarBoletoRequest")
	@ResponsePayload
	public ModificarBoletoResponse getModificar(@RequestPayload ModificarBoletoRequest peticion){
		ModificarBoletoResponse resultado = new ModificarBoletoResponse();
		CompraDAO compra = new CompraDAO(peticion.getIDBoleto());
		int Boleto = compra.BuscarBoleto(peticion.getIDBoleto());
		if(Boleto == peticion.getIDBoleto()) {
			if(compra.ModificarCompra(peticion.getIDViaje(), peticion.getNuevoIDAsiento(), peticion.getIDAsientoAnterior())) {
				resultado.setMensajeConfirmacion("Boleto Modificado");
			}else {
				resultado.setMensajeConfirmacion("No se pudo realizar la modificacion asiento ocupado");
			}
		}else {
			resultado.setMensajeConfirmacion("IDBoleto no encontrado");
		}
		return resultado;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="CancelarBoletoRequest")
	@ResponsePayload
	public CancelarBoletoResponse getCancelar(@RequestPayload CancelarBoletoRequest peticion){
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();
		CompraDAO compra = new CompraDAO(peticion.getIDBoleto());
		int Boleto = compra.BuscarBoleto(peticion.getIDBoleto());
		if(Boleto == peticion.getIDBoleto()) {
			if(compra.cancelarCompra()) {
				if(compra.cancelarCompra2(compra.cancelarCompra())) {
					respuesta.setIDViaje(compra.getCompra().getIdAutobus());
					respuesta.setIDBoleto(compra.getCompra().getIdBoleto());
					respuesta.setIDAsiento(compra.getCompra().getIdAsiento());
					respuesta.setMensajeConfirmacion("Boleto Cancelado");
				}
			}else {
				respuesta.setIDViaje(0);
				respuesta.setIDBoleto(0);
				respuesta.setIDAsiento("");
				respuesta.setMensajeConfirmacion("No se ha podido cancelar el boleto");
			}
		}else {
			respuesta.setMensajeConfirmacion("IDBoleto no encontrado");
		}
		return respuesta;
	}	
}
