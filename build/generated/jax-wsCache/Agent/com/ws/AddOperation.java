
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_pat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom_medecin_prv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cause_medical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_B" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOperation", propOrder = {
    "idPat",
    "nomMedecinPrv",
    "causeMedical",
    "numB"
})
public class AddOperation {

    @XmlElement(name = "ID_pat")
    protected int idPat;
    @XmlElement(name = "nom_medecin_prv")
    protected String nomMedecinPrv;
    @XmlElement(name = "cause_medical")
    protected String causeMedical;
    @XmlElement(name = "num_B")
    protected int numB;

    /**
     * Gets the value of the idPat property.
     * 
     */
    public int getIDPat() {
        return idPat;
    }

    /**
     * Sets the value of the idPat property.
     * 
     */
    public void setIDPat(int value) {
        this.idPat = value;
    }

    /**
     * Gets the value of the nomMedecinPrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMedecinPrv() {
        return nomMedecinPrv;
    }

    /**
     * Sets the value of the nomMedecinPrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMedecinPrv(String value) {
        this.nomMedecinPrv = value;
    }

    /**
     * Gets the value of the causeMedical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseMedical() {
        return causeMedical;
    }

    /**
     * Sets the value of the causeMedical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseMedical(String value) {
        this.causeMedical = value;
    }

    /**
     * Gets the value of the numB property.
     * 
     */
    public int getNumB() {
        return numB;
    }

    /**
     * Sets the value of the numB property.
     * 
     */
    public void setNumB(int value) {
        this.numB = value;
    }

}
