//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.22 a las 10:47:20 AM CDT 
//


package com.tis.autobus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDAutobus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Asiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombrePasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MensajeConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idBoleto",
    "salida",
    "destino",
    "fecha",
    "hora",
    "idAutobus",
    "asiento",
    "nombrePasajero",
    "correo",
    "mensajeConfirmacion"
})
@XmlRootElement(name = "ConfirmarViajeResponse")
public class ConfirmarViajeResponse {

    @XmlElement(name = "IDBoleto")
    protected int idBoleto;
    @XmlElement(name = "Salida", required = true)
    protected String salida;
    @XmlElement(name = "Destino", required = true)
    protected String destino;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "Hora", required = true)
    protected String hora;
    @XmlElement(name = "IDAutobus")
    protected int idAutobus;
    @XmlElement(name = "Asiento", required = true)
    protected String asiento;
    @XmlElement(name = "NombrePasajero", required = true)
    protected String nombrePasajero;
    @XmlElement(name = "Correo", required = true)
    protected String correo;
    @XmlElement(name = "MensajeConfirmacion", required = true)
    protected String mensajeConfirmacion;

    /**
     * Obtiene el valor de la propiedad idBoleto.
     * 
     */
    public int getIDBoleto() {
        return idBoleto;
    }

    /**
     * Define el valor de la propiedad idBoleto.
     * 
     */
    public void setIDBoleto(int value) {
        this.idBoleto = value;
    }

    /**
     * Obtiene el valor de la propiedad salida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalida() {
        return salida;
    }

    /**
     * Define el valor de la propiedad salida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalida(String value) {
        this.salida = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad idAutobus.
     * 
     */
    public int getIDAutobus() {
        return idAutobus;
    }

    /**
     * Define el valor de la propiedad idAutobus.
     * 
     */
    public void setIDAutobus(int value) {
        this.idAutobus = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiento(String value) {
        this.asiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    /**
     * Define el valor de la propiedad nombrePasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePasajero(String value) {
        this.nombrePasajero = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeConfirmacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeConfirmacion() {
        return mensajeConfirmacion;
    }

    /**
     * Define el valor de la propiedad mensajeConfirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeConfirmacion(String value) {
        this.mensajeConfirmacion = value;
    }

}
