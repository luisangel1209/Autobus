//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.23 a las 12:20:40 AM CDT 
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
 *         &lt;element name="IDAsientoAnterior" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NuevoIDAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idAsientoAnterior",
    "nuevoIDAsiento"
})
@XmlRootElement(name = "ModificarBoletoRequest")
public class ModificarBoletoRequest {

    @XmlElement(name = "IDBoleto")
    protected int idBoleto;
    @XmlElement(name = "IDViaje")
    protected int idViaje;
    @XmlElement(name = "IDAsientoAnterior", required = true)
    protected String idAsientoAnterior;
    @XmlElement(name = "NuevoIDAsiento", required = true)
    protected String nuevoIDAsiento;

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
     * Obtiene el valor de la propiedad idAsientoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAsientoAnterior() {
        return idAsientoAnterior;
    }

    /**
     * Define el valor de la propiedad idAsientoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAsientoAnterior(String value) {
        this.idAsientoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoIDAsiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoIDAsiento() {
        return nuevoIDAsiento;
    }

    /**
     * Define el valor de la propiedad nuevoIDAsiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoIDAsiento(String value) {
        this.nuevoIDAsiento = value;
    }

}
