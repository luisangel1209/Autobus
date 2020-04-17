package com.Autobus.TIS;

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

@Endpoint
public class EndPoint {
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConsultarViajeRequest")
	
	@ResponsePayload
	public ConsultarViajeResponse getConsultaViaje(@RequestPayload ConsultarViajeRequest peticion){
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();
		respuesta.setIDHora("Autobus: ADO ID:123 Hora: 13:00 ");
		return respuesta;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAutobusRequest")
	@ResponsePayload
	public SeleccionAutobusResponse getSeleccionAutobus(@RequestPayload SeleccionAutobusRequest peticion1){
		SeleccionAutobusResponse autobus = new SeleccionAutobusResponse();
		autobus.setAsientoDisponible("Asientos Disponibles");
		return autobus;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="SeleccionAsientoRequest")
	@ResponsePayload
	public ConfirmarViajeResponse getConfirmar(@RequestPayload SeleccionAsientoRequest peticion){
		ConfirmarViajeResponse confi = new ConfirmarViajeResponse();
		confi.setSalida("Veracruz");
		confi.setDestino("CDMX");
		confi.setFecha("12-12-20");
		confi.setHora("13:00");
		confi.setNombrePasajero(peticion.getNombrePasajero());
		confi.setAsiento(peticion.getAsientoSeleccionado());
		confi.setIDAutobus(123);
		confi.setIDBoleto(12345);
		return confi;
	}
	
	@PayloadRoot(namespace="http://www.TIS.com/autobus", localPart="ConfirmarViajeRequest")
	@ResponsePayload
	public ConfirmarViajeRequest getConfirmar2(@RequestPayload ConfirmarViajeRequest peticion){
		ConfirmarViajeRequest confi2 = new ConfirmarViajeRequest();
		confi2.setAceptarNO("Viaje Aceptadoo");
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
