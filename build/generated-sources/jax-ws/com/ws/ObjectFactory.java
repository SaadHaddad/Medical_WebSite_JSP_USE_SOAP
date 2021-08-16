
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AfficherOperationResponse_QNAME = new QName("http://WS.com/", "AfficherOperationResponse");
    private final static QName _AjouterCompteRendu_QNAME = new QName("http://WS.com/", "AjouterCompteRendu");
    private final static QName _AjouterCompteRenduResponse_QNAME = new QName("http://WS.com/", "AjouterCompteRenduResponse");
    private final static QName _AfficherOperation_QNAME = new QName("http://WS.com/", "AfficherOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterCompteRenduResponse }
     * 
     */
    public AjouterCompteRenduResponse createAjouterCompteRenduResponse() {
        return new AjouterCompteRenduResponse();
    }

    /**
     * Create an instance of {@link AfficherOperationResponse }
     * 
     */
    public AfficherOperationResponse createAfficherOperationResponse() {
        return new AfficherOperationResponse();
    }

    /**
     * Create an instance of {@link AjouterCompteRendu }
     * 
     */
    public AjouterCompteRendu createAjouterCompteRendu() {
        return new AjouterCompteRendu();
    }

    /**
     * Create an instance of {@link AfficherOperation }
     * 
     */
    public AfficherOperation createAfficherOperation() {
        return new AfficherOperation();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AfficherOperationResponse")
    public JAXBElement<AfficherOperationResponse> createAfficherOperationResponse(AfficherOperationResponse value) {
        return new JAXBElement<AfficherOperationResponse>(_AfficherOperationResponse_QNAME, AfficherOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCompteRendu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AjouterCompteRendu")
    public JAXBElement<AjouterCompteRendu> createAjouterCompteRendu(AjouterCompteRendu value) {
        return new JAXBElement<AjouterCompteRendu>(_AjouterCompteRendu_QNAME, AjouterCompteRendu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCompteRenduResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AjouterCompteRenduResponse")
    public JAXBElement<AjouterCompteRenduResponse> createAjouterCompteRenduResponse(AjouterCompteRenduResponse value) {
        return new JAXBElement<AjouterCompteRenduResponse>(_AjouterCompteRenduResponse_QNAME, AjouterCompteRenduResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AfficherOperation")
    public JAXBElement<AfficherOperation> createAfficherOperation(AfficherOperation value) {
        return new JAXBElement<AfficherOperation>(_AfficherOperation_QNAME, AfficherOperation.class, null, value);
    }

}
