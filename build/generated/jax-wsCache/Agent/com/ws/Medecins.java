
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medecins complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medecins">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_Med" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom_cabinet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specilite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medecins", propOrder = {
    "idMed",
    "nom",
    "nomCabinet",
    "specilite",
    "tel"
})
public class Medecins {

    @XmlElement(name = "id_Med")
    protected int idMed;
    protected String nom;
    @XmlElement(name = "nom_cabinet")
    protected String nomCabinet;
    protected String specilite;
    protected String tel;

    /**
     * Gets the value of the idMed property.
     * 
     */
    public int getIdMed() {
        return idMed;
    }

    /**
     * Sets the value of the idMed property.
     * 
     */
    public void setIdMed(int value) {
        this.idMed = value;
    }

    /**
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the nomCabinet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCabinet() {
        return nomCabinet;
    }

    /**
     * Sets the value of the nomCabinet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCabinet(String value) {
        this.nomCabinet = value;
    }

    /**
     * Gets the value of the specilite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecilite() {
        return specilite;
    }

    /**
     * Sets the value of the specilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecilite(String value) {
        this.specilite = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

}
