
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AjouterCompteRendu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AjouterCompteRendu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ope" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Compt_rendu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AjouterCompteRendu", propOrder = {
    "idOpe",
    "comptRendu"
})
public class AjouterCompteRendu {

    @XmlElement(name = "ID_ope")
    protected int idOpe;
    @XmlElement(name = "Compt_rendu")
    protected String comptRendu;

    /**
     * Gets the value of the idOpe property.
     * 
     */
    public int getIDOpe() {
        return idOpe;
    }

    /**
     * Sets the value of the idOpe property.
     * 
     */
    public void setIDOpe(int value) {
        this.idOpe = value;
    }

    /**
     * Gets the value of the comptRendu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComptRendu() {
        return comptRendu;
    }

    /**
     * Sets the value of the comptRendu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComptRendu(String value) {
        this.comptRendu = value;
    }

}
