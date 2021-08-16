
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

    private final static QName _ListeBillanResponse_QNAME = new QName("http://WS.com/", "ListeBillanResponse");
    private final static QName _ListePatiensResponse_QNAME = new QName("http://WS.com/", "ListePatiensResponse");
    private final static QName _AjouterBillan_QNAME = new QName("http://WS.com/", "AjouterBillan");
    private final static QName _ListePatiens_QNAME = new QName("http://WS.com/", "ListePatiens");
    private final static QName _AjouterBillanResponse_QNAME = new QName("http://WS.com/", "AjouterBillanResponse");
    private final static QName _ListeBillan_QNAME = new QName("http://WS.com/", "ListeBillan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterBillan }
     * 
     */
    public AjouterBillan createAjouterBillan() {
        return new AjouterBillan();
    }

    /**
     * Create an instance of {@link ListePatiens }
     * 
     */
    public ListePatiens createListePatiens() {
        return new ListePatiens();
    }

    /**
     * Create an instance of {@link AjouterBillanResponse }
     * 
     */
    public AjouterBillanResponse createAjouterBillanResponse() {
        return new AjouterBillanResponse();
    }

    /**
     * Create an instance of {@link ListeBillan }
     * 
     */
    public ListeBillan createListeBillan() {
        return new ListeBillan();
    }

    /**
     * Create an instance of {@link ListeBillanResponse }
     * 
     */
    public ListeBillanResponse createListeBillanResponse() {
        return new ListeBillanResponse();
    }

    /**
     * Create an instance of {@link ListePatiensResponse }
     * 
     */
    public ListePatiensResponse createListePatiensResponse() {
        return new ListePatiensResponse();
    }

    /**
     * Create an instance of {@link Billan }
     * 
     */
    public Billan createBillan() {
        return new Billan();
    }

    /**
     * Create an instance of {@link Patients }
     * 
     */
    public Patients createPatients() {
        return new Patients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeBillanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeBillanResponse")
    public JAXBElement<ListeBillanResponse> createListeBillanResponse(ListeBillanResponse value) {
        return new JAXBElement<ListeBillanResponse>(_ListeBillanResponse_QNAME, ListeBillanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListePatiensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListePatiensResponse")
    public JAXBElement<ListePatiensResponse> createListePatiensResponse(ListePatiensResponse value) {
        return new JAXBElement<ListePatiensResponse>(_ListePatiensResponse_QNAME, ListePatiensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterBillan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AjouterBillan")
    public JAXBElement<AjouterBillan> createAjouterBillan(AjouterBillan value) {
        return new JAXBElement<AjouterBillan>(_AjouterBillan_QNAME, AjouterBillan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListePatiens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListePatiens")
    public JAXBElement<ListePatiens> createListePatiens(ListePatiens value) {
        return new JAXBElement<ListePatiens>(_ListePatiens_QNAME, ListePatiens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterBillanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AjouterBillanResponse")
    public JAXBElement<AjouterBillanResponse> createAjouterBillanResponse(AjouterBillanResponse value) {
        return new JAXBElement<AjouterBillanResponse>(_AjouterBillanResponse_QNAME, AjouterBillanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeBillan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeBillan")
    public JAXBElement<ListeBillan> createListeBillan(ListeBillan value) {
        return new JAXBElement<ListeBillan>(_ListeBillan_QNAME, ListeBillan.class, null, value);
    }

}
