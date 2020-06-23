//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.23 a las 12:20:40 AM CDT 
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
 *         &lt;element name="Asiento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IdAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "asiento"
})
@XmlRootElement(name = "SeleccionAutobusResponse")
public class SeleccionAutobusResponse {

    @XmlElement(name = "Asiento", required = true)
    protected List<SeleccionAutobusResponse.Asiento> asiento;

    /**
     * Gets the value of the asiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeleccionAutobusResponse.Asiento }
     * 
     * 
     */
    public List<SeleccionAutobusResponse.Asiento> getAsiento() {
        if (asiento == null) {
            asiento = new ArrayList<SeleccionAutobusResponse.Asiento>();
        }
        return this.asiento;
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
     *         &lt;element name="IdAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idAsiento",
        "estatus"
    })
    public static class Asiento {

        @XmlElement(name = "IdAsiento", required = true)
        protected String idAsiento;
        @XmlElement(name = "Estatus", required = true)
        protected String estatus;

        /**
         * Obtiene el valor de la propiedad idAsiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdAsiento() {
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
        public void setIdAsiento(String value) {
            this.idAsiento = value;
        }

        /**
         * Obtiene el valor de la propiedad estatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstatus() {
            return estatus;
        }

        /**
         * Define el valor de la propiedad estatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstatus(String value) {
            this.estatus = value;
        }

    }

}
