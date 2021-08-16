
package com.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Chirurgical", targetNamespace = "http://WS.com/", wsdlLocation = "http://localhost:8085/WEB_SERVICES/Chirurgical?wsdl")
public class Chirurgical_Service
    extends Service
{

    private final static URL CHIRURGICAL_WSDL_LOCATION;
    private final static WebServiceException CHIRURGICAL_EXCEPTION;
    private final static QName CHIRURGICAL_QNAME = new QName("http://WS.com/", "Chirurgical");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/WEB_SERVICES/Chirurgical?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHIRURGICAL_WSDL_LOCATION = url;
        CHIRURGICAL_EXCEPTION = e;
    }

    public Chirurgical_Service() {
        super(__getWsdlLocation(), CHIRURGICAL_QNAME);
    }

    public Chirurgical_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHIRURGICAL_QNAME, features);
    }

    public Chirurgical_Service(URL wsdlLocation) {
        super(wsdlLocation, CHIRURGICAL_QNAME);
    }

    public Chirurgical_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHIRURGICAL_QNAME, features);
    }

    public Chirurgical_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Chirurgical_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Chirurgical
     */
    @WebEndpoint(name = "ChirurgicalPort")
    public Chirurgical getChirurgicalPort() {
        return super.getPort(new QName("http://WS.com/", "ChirurgicalPort"), Chirurgical.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Chirurgical
     */
    @WebEndpoint(name = "ChirurgicalPort")
    public Chirurgical getChirurgicalPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS.com/", "ChirurgicalPort"), Chirurgical.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHIRURGICAL_EXCEPTION!= null) {
            throw CHIRURGICAL_EXCEPTION;
        }
        return CHIRURGICAL_WSDL_LOCATION;
    }

}
