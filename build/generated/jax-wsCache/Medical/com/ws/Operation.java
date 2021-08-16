
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cause_medecal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compte_rendu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etat_chu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etat_med" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_operation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_pat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="medecin_operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom_medecin_prv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "operation", propOrder = {
    "adress",
    "billan",
    "causeMedecal",
    "compteRendu",
    "dateOperation",
    "dateN",
    "etatChu",
    "etatMed",
    "idOperation",
    "idPat",
    "medecinOperation",
    "nom",
    "nomMedecinPrv",
    "prenom",
    "sex",
    "tel"
})
public class Operation {

    protected String adress;
    protected String billan;
    @XmlElement(name = "cause_medecal")
    protected String causeMedecal;
    @XmlElement(name = "compte_rendu")
    protected String compteRendu;
    protected String dateOperation;
    @XmlElement(name = "date_n")
    protected String dateN;
    @XmlElement(name = "etat_chu")
    protected String etatChu;
    @XmlElement(name = "etat_med")
    protected String etatMed;
    @XmlElement(name = "id_operation")
    protected int idOperation;
    @XmlElement(name = "id_pat")
    protected int idPat;
    @XmlElement(name = "medecin_operation")
    protected String medecinOperation;
    protected String nom;
    @XmlElement(name = "nom_medecin_prv")
    protected String nomMedecinPrv;
    protected String prenom;
    protected String sex;
    protected String tel;

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

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
     * Gets the value of the causeMedecal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseMedecal() {
        return causeMedecal;
    }

    /**
     * Sets the value of the causeMedecal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseMedecal(String value) {
        this.causeMedecal = value;
    }

    /**
     * Gets the value of the compteRendu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteRendu() {
        return compteRendu;
    }

    /**
     * Sets the value of the compteRendu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteRendu(String value) {
        this.compteRendu = value;
    }

    /**
     * Gets the value of the dateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOperation() {
        return dateOperation;
    }

    /**
     * Sets the value of the dateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOperation(String value) {
        this.dateOperation = value;
    }

    /**
     * Gets the value of the dateN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateN() {
        return dateN;
    }

    /**
     * Sets the value of the dateN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateN(String value) {
        this.dateN = value;
    }

    /**
     * Gets the value of the etatChu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtatChu() {
        return etatChu;
    }

    /**
     * Sets the value of the etatChu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtatChu(String value) {
        this.etatChu = value;
    }

    /**
     * Gets the value of the etatMed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtatMed() {
        return etatMed;
    }

    /**
     * Sets the value of the etatMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtatMed(String value) {
        this.etatMed = value;
    }

    /**
     * Gets the value of the idOperation property.
     * 
     */
    public int getIdOperation() {
        return idOperation;
    }

    /**
     * Sets the value of the idOperation property.
     * 
     */
    public void setIdOperation(int value) {
        this.idOperation = value;
    }

    /**
     * Gets the value of the idPat property.
     * 
     */
    public int getIdPat() {
        return idPat;
    }

    /**
     * Sets the value of the idPat property.
     * 
     */
    public void setIdPat(int value) {
        this.idPat = value;
    }

    /**
     * Gets the value of the medecinOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedecinOperation() {
        return medecinOperation;
    }

    /**
     * Sets the value of the medecinOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedecinOperation(String value) {
        this.medecinOperation = value;
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
     * Gets the value of the prenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the value of the prenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
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
