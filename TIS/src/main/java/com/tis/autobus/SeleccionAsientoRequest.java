//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.20 a las 10:53:59 PM CDT 
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
 *         &lt;element name="IDAsientoSeleccionado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombrePasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idAsientoSeleccionado",
    "nombrePasajero"
})
@XmlRootElement(name = "SeleccionAsientoRequest")
public class SeleccionAsientoRequest {

    @XmlElement(name = "IDAsientoSeleccionado", required = true)
    protected String idAsientoSeleccionado;
    @XmlElement(name = "NombrePasajero", required = true)
    protected String nombrePasajero;

    /**
     * Obtiene el valor de la propiedad idAsientoSeleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAsientoSeleccionado() {
        return idAsientoSeleccionado;
    }

    /**
     * Define el valor de la propiedad idAsientoSeleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAsientoSeleccionado(String value) {
        this.idAsientoSeleccionado = value;
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

}
