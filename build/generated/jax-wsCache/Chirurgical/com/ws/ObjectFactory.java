
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

    private final static QName _ConfirmerOperation_QNAME = new QName("http://WS.com/", "ConfirmerOperation");
    private final static QName _DisponinibibiliteMedecin_QNAME = new QName("http://WS.com/", "DisponinibibiliteMedecin");
    private final static QName _DisponinibibiliteResourceResponse_QNAME = new QName("http://WS.com/", "DisponinibibiliteResourceResponse");
    private final static QName _AllouerResourceResponse_QNAME = new QName("http://WS.com/", "AllouerResourceResponse");
    private final static QName _RecupereDateOperationResponse_QNAME = new QName("http://WS.com/", "RecupereDateOperationResponse");
    private final static QName _AllouerResource_QNAME = new QName("http://WS.com/", "AllouerResource");
    private final static QName _DisponinibibiliteMedecinResponse_QNAME = new QName("http://WS.com/", "DisponinibibiliteMedecinResponse");
    private final static QName _DisponinibibiliteResource_QNAME = new QName("http://WS.com/", "DisponinibibiliteResource");
    private final static QName _RecupereDateOperation_QNAME = new QName("http://WS.com/", "RecupereDateOperation");
    private final static QName _ListeOperation_QNAME = new QName("http://WS.com/", "ListeOperation");
    private final static QName _ListeOperationResponse_QNAME = new QName("http://WS.com/", "ListeOperationResponse");
    private final static QName _ConfirmerOperationResponse_QNAME = new QName("http://WS.com/", "ConfirmerOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllouerResourceResponse }
     * 
     */
    public AllouerResourceResponse createAllouerResourceResponse() {
        return new AllouerResourceResponse();
    }

    /**
     * Create an instance of {@link RecupereDateOperationResponse }
     * 
     */
    public RecupereDateOperationResponse createRecupereDateOperationResponse() {
        return new RecupereDateOperationResponse();
    }

    /**
     * Create an instance of {@link AllouerResource }
     * 
     */
    public AllouerResource createAllouerResource() {
        return new AllouerResource();
    }

    /**
     * Create an instance of {@link DisponinibibiliteMedecin }
     * 
     */
    public DisponinibibiliteMedecin createDisponinibibiliteMedecin() {
        return new DisponinibibiliteMedecin();
    }

    /**
     * Create an instance of {@link DisponinibibiliteResourceResponse }
     * 
     */
    public DisponinibibiliteResourceResponse createDisponinibibiliteResourceResponse() {
        return new DisponinibibiliteResourceResponse();
    }

    /**
     * Create an instance of {@link ConfirmerOperation }
     * 
     */
    public ConfirmerOperation createConfirmerOperation() {
        return new ConfirmerOperation();
    }

    /**
     * Create an instance of {@link ConfirmerOperationResponse }
     * 
     */
    public ConfirmerOperationResponse createConfirmerOperationResponse() {
        return new ConfirmerOperationResponse();
    }

    /**
     * Create an instance of {@link ListeOperation }
     * 
     */
    public ListeOperation createListeOperation() {
        return new ListeOperation();
    }

    /**
     * Create an instance of {@link ListeOperationResponse }
     * 
     */
    public ListeOperationResponse createListeOperationResponse() {
        return new ListeOperationResponse();
    }

    /**
     * Create an instance of {@link RecupereDateOperation }
     * 
     */
    public RecupereDateOperation createRecupereDateOperation() {
        return new RecupereDateOperation();
    }

    /**
     * Create an instance of {@link DisponinibibiliteMedecinResponse }
     * 
     */
    public DisponinibibiliteMedecinResponse createDisponinibibiliteMedecinResponse() {
        return new DisponinibibiliteMedecinResponse();
    }

    /**
     * Create an instance of {@link DisponinibibiliteResource }
     * 
     */
    public DisponinibibiliteResource createDisponinibibiliteResource() {
        return new DisponinibibiliteResource();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmerOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ConfirmerOperation")
    public JAXBElement<ConfirmerOperation> createConfirmerOperation(ConfirmerOperation value) {
        return new JAXBElement<ConfirmerOperation>(_ConfirmerOperation_QNAME, ConfirmerOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisponinibibiliteMedecin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "DisponinibibiliteMedecin")
    public JAXBElement<DisponinibibiliteMedecin> createDisponinibibiliteMedecin(DisponinibibiliteMedecin value) {
        return new JAXBElement<DisponinibibiliteMedecin>(_DisponinibibiliteMedecin_QNAME, DisponinibibiliteMedecin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisponinibibiliteResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "DisponinibibiliteResourceResponse")
    public JAXBElement<DisponinibibiliteResourceResponse> createDisponinibibiliteResourceResponse(DisponinibibiliteResourceResponse value) {
        return new JAXBElement<DisponinibibiliteResourceResponse>(_DisponinibibiliteResourceResponse_QNAME, DisponinibibiliteResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllouerResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AllouerResourceResponse")
    public JAXBElement<AllouerResourceResponse> createAllouerResourceResponse(AllouerResourceResponse value) {
        return new JAXBElement<AllouerResourceResponse>(_AllouerResourceResponse_QNAME, AllouerResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereDateOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "RecupereDateOperationResponse")
    public JAXBElement<RecupereDateOperationResponse> createRecupereDateOperationResponse(RecupereDateOperationResponse value) {
        return new JAXBElement<RecupereDateOperationResponse>(_RecupereDateOperationResponse_QNAME, RecupereDateOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllouerResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "AllouerResource")
    public JAXBElement<AllouerResource> createAllouerResource(AllouerResource value) {
        return new JAXBElement<AllouerResource>(_AllouerResource_QNAME, AllouerResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisponinibibiliteMedecinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "DisponinibibiliteMedecinResponse")
    public JAXBElement<DisponinibibiliteMedecinResponse> createDisponinibibiliteMedecinResponse(DisponinibibiliteMedecinResponse value) {
        return new JAXBElement<DisponinibibiliteMedecinResponse>(_DisponinibibiliteMedecinResponse_QNAME, DisponinibibiliteMedecinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisponinibibiliteResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "DisponinibibiliteResource")
    public JAXBElement<DisponinibibiliteResource> createDisponinibibiliteResource(DisponinibibiliteResource value) {
        return new JAXBElement<DisponinibibiliteResource>(_DisponinibibiliteResource_QNAME, DisponinibibiliteResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereDateOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "RecupereDateOperation")
    public JAXBElement<RecupereDateOperation> createRecupereDateOperation(RecupereDateOperation value) {
        return new JAXBElement<RecupereDateOperation>(_RecupereDateOperation_QNAME, RecupereDateOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeOperation")
    public JAXBElement<ListeOperation> createListeOperation(ListeOperation value) {
        return new JAXBElement<ListeOperation>(_ListeOperation_QNAME, ListeOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ListeOperationResponse")
    public JAXBElement<ListeOperationResponse> createListeOperationResponse(ListeOperationResponse value) {
        return new JAXBElement<ListeOperationResponse>(_ListeOperationResponse_QNAME, ListeOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmerOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.com/", name = "ConfirmerOperationResponse")
    public JAXBElement<ConfirmerOperationResponse> createConfirmerOperationResponse(ConfirmerOperationResponse value) {
        return new JAXBElement<ConfirmerOperationResponse>(_ConfirmerOperationResponse_QNAME, ConfirmerOperationResponse.class, null, value);
    }

}
