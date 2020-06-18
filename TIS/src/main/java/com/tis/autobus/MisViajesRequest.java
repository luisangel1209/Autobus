//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.17 a las 09:29:43 PM CDT 
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
 *         &lt;element name="NombreIngresadoEnLaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorreoIngresadoEnLaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nombreIngresadoEnLaCompra",
    "correoIngresadoEnLaCompra"
})
@XmlRootElement(name = "MisViajesRequest")
public class MisViajesRequest {

    @XmlElement(name = "NombreIngresadoEnLaCompra", required = true)
    protected String nombreIngresadoEnLaCompra;
    @XmlElement(name = "CorreoIngresadoEnLaCompra", required = true)
    protected String correoIngresadoEnLaCompra;

    /**
     * Obtiene el valor de la propiedad nombreIngresadoEnLaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreIngresadoEnLaCompra() {
        return nombreIngresadoEnLaCompra;
    }

    /**
     * Define el valor de la propiedad nombreIngresadoEnLaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreIngresadoEnLaCompra(String value) {
        this.nombreIngresadoEnLaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad correoIngresadoEnLaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoIngresadoEnLaCompra() {
        return correoIngresadoEnLaCompra;
    }

    /**
     * Define el valor de la propiedad correoIngresadoEnLaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoIngresadoEnLaCompra(String value) {
        this.correoIngresadoEnLaCompra = value;
    }

}
