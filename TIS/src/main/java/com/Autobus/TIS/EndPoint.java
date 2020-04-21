package com.Autobus.TIS;


import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.tis.autobus.CancelarBoletoRequest;
import com.tis.autobus.CancelarBoletoResponse;
import com.tis.autobus.ConfirmacionCancelarRequest;
import com.tis.autobus.ConfirmacionCancelarResponse;
import com.tis.autobus.ConfirmacionModificarRequest;
import com.tis.autobus.ConfirmacionModificarResponse;
import com.tis.autobus.ConfirmarViajeRequest;
import com.tis.autobus.ConfirmarViajeResponse;
import com.tis.autobus.ConsultarViajeRequest;
import com.tis.autobus.ConsultarViajeResponse;
import com.tis.autobus.ModificarBoletoRequest;
import com.tis.autobus.ModificarBoletoResponse;
import com.tis.autobus.SeleccionAsientoRequest;
import com.tis.autobus.SeleccionAutobusRequest;
import com.tis.autobus.SeleccionAutobusResponse;

import Controlador.AsientoViajeDAO;
import Controlador.ConsultarViajeDAO;
import Modelo.Viajes;
import Modelo.Asientos;


@Endpoint
public class EndPoint {
	
	/**
	 * Metodo para consultar la informacion de una viaje
	 * @param peticion
	 * @return
	 * @throws ClassNotFoundException 
	 */
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConsultarViajeRequest")
	
	@ResponsePayload
	public ConsultarViajeResponse getConsultaViaje(@RequestPayload ConsultarViajeRequest peticion){
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();
		
		ConsultarViajeDAO consulta = new ConsultarViajeDAO(peticion.getSalida(),peticion.getDestino(),peticion.getFecha());
		ArrayList<Viajes> lista = consulta.consultViaje();
		
		if(lista.size() !=0) {
			respuesta.setIDAutobus(lista.get(0).getIDAutobus());
			respuesta.setHora(lista.get(0).getHora());
			respuesta.setPrecio(lista.get(0).getPrecio());
		}else {
			respuesta.setIDAutobus(0);
			respuesta.setHora("");
			respuesta.setPrecio("");
		}
		
		return respuesta;
	}
	
	
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAutobusRequest")
	@ResponsePayload
	public SeleccionAutobusResponse getSeleccionAutobus(@RequestPayload SeleccionAutobusRequest peticion1){
		SeleccionAutobusResponse respuesta = new SeleccionAutobusResponse();
		AsientoViajeDAO asiento = new AsientoViajeDAO(peticion1.getIDSeleccion());
		ArrayList<Asientos> asientosViaje = asiento.getAsientos();
		
		if(asientosViaje.size() != 0) {
			ArrayList<String>idAsientos = new ArrayList<String>();
			ArrayList<String> estatus = new ArrayList<String>();
			for(Asientos a:asientosViaje) {
				idAsientos.add(a.getIDAsiento());
				if(a.getEstatus()) {
					estatus.add(a.getIDAsiento()+"| Disponible");
				}else {
					estatus.add(a.getIDAsiento()+"| Ocupado");	
				}
			}
			respuesta.setIdAsiento(idAsientos);		
			respuesta.setEstatus(estatus);
		}else {
			ArrayList<String>idAsientos = new ArrayList<String>();
			ArrayList<String> estatus = new ArrayList<String>();
			idAsientos.add("");
			estatus.add("");
			respuesta.setIdAsiento(idAsientos);
			respuesta.setEstatus(estatus);
		}
		return respuesta;
	}
	
	
	
	
	
	
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAsientoRequest")
	@ResponsePayload
	public ConfirmarViajeResponse getConfirmar(@RequestPayload SeleccionAsientoRequest peticion){
		ConfirmarViajeResponse confi = new ConfirmarViajeResponse();
		confi.setSalida("Veracruz");
		confi.setDestino("CDMX");
		confi.setFecha("12-12-20");
		confi.setHora("13:00");
		//confi.setNombrePasajero(peticion.getNombrePasajero());
		//confi.setAsiento(peticion.getAsientoSeleccionado());
		confi.setIDAutobus(123);
		confi.setIDBoleto(12345);
		return confi;
	}
	
	
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConfirmarViajeRequest")
	@ResponsePayload
	public ConfirmarViajeRequest getConfirmar2(@RequestPayload ConfirmarViajeRequest peticion){
		ConfirmarViajeRequest confi2 = new ConfirmarViajeRequest();
		confi2.setConfirmar("Viaje Aceptadoo");
		return confi2;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ModificarBoletoRequest")
	@ResponsePayload
	public ModificarBoletoResponse getModificar(@RequestPayload ModificarBoletoRequest peticion){
		ModificarBoletoResponse modi = new ModificarBoletoResponse();
		modi.setHora("13:00");
		modi.setNombrePasajero("Jesus");
		return modi;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConfirmacionModificarRequest")
	@ResponsePayload
	public ConfirmacionModificarResponse getModificarConfirmacion(@RequestPayload ConfirmacionModificarRequest peticion){
		ConfirmacionModificarResponse modi2 = new ConfirmacionModificarResponse();
		modi2.setConfirmar("Boleto Modificado");
		return modi2;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="CancelarBoletoRequest")
	@ResponsePayload
	public CancelarBoletoResponse getCancelar(@RequestPayload CancelarBoletoRequest peticion){
		CancelarBoletoResponse cancel = new CancelarBoletoResponse();
		cancel.setSalida("Veracruz");
		cancel.setDestino("CDMX");
		cancel.setFecha("12-12-20");
		cancel.setHora("13:00");
		cancel.setNombrePasajero("Jose");
		cancel.setAsiento(123);
		cancel.setIDAutobus(123);
		cancel.setIDBoleto(peticion.getIDBoleto());
		return cancel;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConfirmacionCancelarRequest")
	@ResponsePayload
	public ConfirmacionCancelarResponse getCancelarConfirmacion(@RequestPayload ConfirmacionCancelarRequest peticion){
		ConfirmacionCancelarResponse cancel2 = new ConfirmacionCancelarResponse();
		cancel2.setConfirmar("Boleto Cancelado");
		return cancel2;
	}
}
