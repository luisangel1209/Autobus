//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.23 a las 10:58:16 PM CDT 
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
 *         &lt;element name="IDViaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idViaje",
    "idAsiento",
    "mensajeConfirmacion"
})
@XmlRootElement(name = "CancelarBoletoResponse")
public class CancelarBoletoResponse {

    @XmlElement(name = "IDBoleto")
    protected int idBoleto;
    @XmlElement(name = "IDViaje")
    protected int idViaje;
    @XmlElement(name = "IDAsiento", required = true)
    protected String idAsiento;
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
     * Obtiene el valor de la propiedad idViaje.
     * 
     */
    public int getIDViaje() {
        return idViaje;
    }

    /**
     * Define el valor de la propiedad idViaje.
     * 
     */
    public void setIDViaje(int value) {
        this.idViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAsiento() {
        return idAsiento;
    }

    /**
     * Define el valor de la propiedad idAsiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAsiento(String value) {
        this.idAsiento = value;
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
