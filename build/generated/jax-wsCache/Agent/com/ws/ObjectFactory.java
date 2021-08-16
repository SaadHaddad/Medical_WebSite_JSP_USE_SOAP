
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
    private final static QName _ListeNomMedecins_QNAME = new QName("http://WS.com/", "ListeNomMedecins");
    private final static QName _AddPatienResponse_QNAME = new QName("http://WS.com/", "AddPatienResponse");
    private final static QName _ListePatiensResponse_QNAME = new QName("http://WS.com/", "ListePatiensResponse");
    private final static QName _AddPatien_QNAME = new QName("http://WS.com/", "AddPatien");
    private final static QName _ListePatiens_QNAME = new QName("http://WS.com/", "ListePatiens");
    private final static QName _AddOperationResponse_QNAME = new QName("http://WS.com/", "AddOperationResponse");
    private final static QName _ListMedecinsResponse_QNAME = new QName("http://WS.com/", "ListMedecinsResponse");
    private final static QName _ListeNomMedecinsResponse_QNAME = new QName("http://WS.com/", "ListeNomMedecinsResponse");
    private final static QName _ListMedecins_QNAME = new QName("http://WS.com/", "ListMedecins");
    private final static QName _AddOperation_QNAME = new QName("http://WS.com/", "AddOperation");
    private final static QName _AfficherOperation_QNAME = new QName("http://WS.com/", "AfficherOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListePatiens }
     * 
     */
    public ListePatiens createListePatiens() {
        return new ListePatiens();
    }

    /**
     * Create an instance of {@link AddOperationResponse }
     * 
     */
    public AddOperationResponse createAddOperationResponse() {
        return new AddOperationResponse();
    }

    /**
     * Create an instance of {@link ListMedecinsResponse }
     * 
     */
    public ListMedecinsResponse createListMedecinsResponse() {
        return new ListMedecinsResponse();
    }

    /**
     * Create an instance of {@link ListeNomMedecinsResponse }
     * 
     */
    public ListeNomMedecinsResponse createListeNomMedecinsResponse() {
        return new ListeNomMedecinsResponse();
    }

    /**
     * Create an instance of {@link AddPatienResponse }
     * 
     */
    public AddPatienResponse createAddPatienResponse() {
        return new AddPatienResponse();
    }

    /**
     * Create an instance of {@link ListePatiensResponse }
     * 
     */
    public ListePatiensResponse createListePatiensResponse() {
        return new ListePatiensResponse();
    }

    /**
     * Create an instance of {@link AddPatien }
     * 
     */
    public AddPatien createAddPatien() {
        return new AddPatien();
    }

    /**
     * Create an instance of {@link AfficherOperationResponse }
     * 
     */
    public AfficherOperationResponse createAfficherOperationResponse() {
        return new AfficherOperationResponse();
    }

    /**
     * Create an instance of {@link ListeNomMedecins }
     * 
     */
    public ListeNomMedecins createListeNomMedecins() {
        return new ListeNomMedecins();
    }

    /**
     * Create an instance of {@link AddOperation }
     * 
     */
    public AddOperation createAddOperation() {
        return new AddOperation();
    }

    /**
     * Create an instance of {@link AfficherOperation }
     * 
     */
    public AfficherOperation createAfficherOperation() {
        return new AfficherOperation();
    }

    /**
     * Create an instance of {@link ListMedecins }
     * 
     */
    public ListMedecins createListMedecins() {
        return new ListMedecins();
    }

    /**
     * Create an instance of {@link Patients }
     * 
     */
    public Patients createPatients() {
        return new Patients();
    }

    /**
     * Create an instance of {@link Medecins }
     * 
     */
    public Medecins createMedecins() {
        return new Medecins();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeNomMedecins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeNomMedecins")
    public JAXBElement<ListeNomMedecins> createListeNomMedecins(ListeNomMedecins value) {
        return new JAXBElement<ListeNomMedecins>(_ListeNomMedecins_QNAME, ListeNomMedecins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPatienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AddPatienResponse")
    public JAXBElement<AddPatienResponse> createAddPatienResponse(AddPatienResponse value) {
        return new JAXBElement<AddPatienResponse>(_AddPatienResponse_QNAME, AddPatienResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPatien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AddPatien")
    public JAXBElement<AddPatien> createAddPatien(AddPatien value) {
        return new JAXBElement<AddPatien>(_AddPatien_QNAME, AddPatien.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AddOperationResponse")
    public JAXBElement<AddOperationResponse> createAddOperationResponse(AddOperationResponse value) {
        return new JAXBElement<AddOperationResponse>(_AddOperationResponse_QNAME, AddOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMedecinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListMedecinsResponse")
    public JAXBElement<ListMedecinsResponse> createListMedecinsResponse(ListMedecinsResponse value) {
        return new JAXBElement<ListMedecinsResponse>(_ListMedecinsResponse_QNAME, ListMedecinsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeNomMedecinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeNomMedecinsResponse")
    public JAXBElement<ListeNomMedecinsResponse> createListeNomMedecinsResponse(ListeNomMedecinsResponse value) {
        return new JAXBElement<ListeNomMedecinsResponse>(_ListeNomMedecinsResponse_QNAME, ListeNomMedecinsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMedecins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListMedecins")
    public JAXBElement<ListMedecins> createListMedecins(ListMedecins value) {
        return new JAXBElement<ListMedecins>(_ListMedecins_QNAME, ListMedecins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AddOperation")
    public JAXBElement<AddOperation> createAddOperation(AddOperation value) {
        return new JAXBElement<AddOperation>(_AddOperation_QNAME, AddOperation.class, null, value);
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
