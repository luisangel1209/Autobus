//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.17 a las 09:29:43 PM CDT 
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
 *         &lt;element name="MisViajes" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="IDViaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="IDAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "misViajes"
})
@XmlRootElement(name = "MisViajesResponse")
public class MisViajesResponse {

    @XmlElement(name = "MisViajes", required = true)
    protected List<MisViajesResponse.MisViajes> misViajes;

    /**
     * Gets the value of the misViajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misViajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisViajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MisViajesResponse.MisViajes }
     * 
     * 
     */
    public List<MisViajesResponse.MisViajes> getMisViajes() {
        if (misViajes == null) {
            misViajes = new ArrayList<MisViajesResponse.MisViajes>();
        }
        return this.misViajes;
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
     *         &lt;element name="IDBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="IDViaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="IDAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idAsiento"
    })
    public static class MisViajes {

        @XmlElement(name = "IDBoleto")
        protected int idBoleto;
        @XmlElement(name = "IDViaje")
        protected int idViaje;
        @XmlElement(name = "IDAsiento", required = true)
        protected String idAsiento;

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

    }

}
