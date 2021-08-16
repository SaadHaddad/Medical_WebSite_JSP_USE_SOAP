
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AjouterBillan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AjouterBillan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_pa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AjouterBillan", propOrder = {
    "billan",
    "idPa"
})
public class AjouterBillan {

    protected String billan;
    @XmlElement(name = "id_pa")
    protected int idPa;

    /**
     * Gets the value of the billan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillan() {
        return billan;
    }

    /**
     * Sets the value of the billan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillan(String value) {
        this.billan = value;
    }

    /**
     * Gets the value of the idPa property.
     * 
     */
    public int getIdPa() {
        return idPa;
    }

    /**
     * Sets the value of the idPa property.
     * 
     */
    public void setIdPa(int value) {
        this.idPa = value;
    }

}
