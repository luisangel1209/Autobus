//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.19 a las 02:52:59 PM CDT 
//


package com.tis.autobus;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Viajes" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "viajes"
})
@XmlRootElement(name = "ConsultarDestinoResponse")
public class ConsultarDestinoResponse {

    @XmlElement(name = "Viajes", required = true)
    protected List<ConsultarDestinoResponse.Viajes> viajes;

    /**
     * Gets the value of the viajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarDestinoResponse.Viajes }
     * 
     * 
     */
    public List<ConsultarDestinoResponse.Viajes> getViajes() {
        if (viajes == null) {
            viajes = new ArrayList<ConsultarDestinoResponse.Viajes>();
        }
        return this.viajes;
    }


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
     *         &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "salida",
        "destino"
    })
    public static class Viajes {

        @XmlElement(name = "Salida", required = true)
        protected String salida;
        @XmlElement(name = "Destino", required = true)
        protected String destino;

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

    }

}
