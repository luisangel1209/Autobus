//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.20 a las 10:53:59 PM CDT 
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
 *         &lt;element name="IdAsiento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "SeleccionAutobusResponse")
public class SeleccionAutobusResponse {

    @XmlElement(name = "IdAsiento", required = true)
    protected List<String> idAsiento;
    @XmlElement(name = "Estatus", required = true)
    protected List<String> estatus;

    /**
     * Gets the value of the idAsiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idAsiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdAsiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdAsiento() {
        if (idAsiento == null) {
            idAsiento = new ArrayList<String>();
        }
        return this.idAsiento;
    }

    /**
     * Gets the value of the estatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstatus() {
        if (estatus == null) {
            estatus = new ArrayList<String>();
        }
        return this.estatus;
    }

	public void setIdAsiento(ArrayList<String> idAsientos) {
		// TODO Auto-generated method stub
		
	}

	public void setEstatus(ArrayList<String> estatus2) {
		// TODO Auto-generated method stub
		
	}

}
