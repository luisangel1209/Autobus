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
 *         &lt;element name="Viaje" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDViaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="IDAutobus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "viaje"
})
@XmlRootElement(name = "ConsultarViajeResponse")
public class ConsultarViajeResponse {

    @XmlElement(name = "Viaje", required = true)
    protected List<ConsultarViajeResponse.Viaje> viaje;

    /**
     * Gets the value of the viaje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarViajeResponse.Viaje }
     * 
     * 
     */
    public List<ConsultarViajeResponse.Viaje> getViaje() {
        if (viaje == null) {
            viaje = new ArrayList<ConsultarViajeResponse.Viaje>();
        }
        return this.viaje;
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
     *         &lt;element name="IDViaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="IDAutobus" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idViaje",
        "idAutobus",
        "hora",
        "precio",
        "mensaje"
    })
    public static class Viaje {

        @XmlElement(name = "IDViaje")
        protected int idViaje;
        @XmlElement(name = "IDAutobus")
        protected int idAutobus;
        @XmlElement(name = "Hora", required = true)
        protected String hora;
        @XmlElement(name = "Precio", required = true)
        protected String precio;
        @XmlElement(name = "Mensaje", required = true)
        protected String mensaje;

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
         * Obtiene el valor de la propiedad precio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrecio(String value) {
            this.precio = value;
        }

        /**
         * Obtiene el valor de la propiedad mensaje.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMensaje() {
            return mensaje;
        }

        /**
         * Define el valor de la propiedad mensaje.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMensaje(String value) {
            this.mensaje = value;
        }

    }

}
