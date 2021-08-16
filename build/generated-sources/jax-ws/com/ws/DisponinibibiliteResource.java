
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisponinibibiliteResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisponinibibiliteResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_cabinet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisponinibibiliteResource", propOrder = {
    "numCabinet"
})
public class DisponinibibiliteResource {

    @XmlElement(name = "num_cabinet")
    protected int numCabinet;

    /**
     * Gets the value of the numCabinet property.
     * 
     */
    public int getNumCabinet() {
        return numCabinet;
    }

    /**
     * Sets the value of the numCabinet property.
     * 
     */
    public void setNumCabinet(int value) {
        this.numCabinet = value;
    }

}
