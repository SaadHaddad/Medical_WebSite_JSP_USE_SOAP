
package com.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Medical", targetNamespace = "http://WS.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Medical {


    /**
     * 
     * @return
     *     returns java.util.List<com.ws.Operation>
     */
    @WebMethod(operationName = "AfficherOperation")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AfficherOperation", targetNamespace = "http://WS.com/", className = "com.ws.AfficherOperation")
    @ResponseWrapper(localName = "AfficherOperationResponse", targetNamespace = "http://WS.com/", className = "com.ws.AfficherOperationResponse")
    @Action(input = "http://WS.com/Medical/AfficherOperationRequest", output = "http://WS.com/Medical/AfficherOperationResponse")
    public List<Operation> afficherOperation();

    /**
     * 
     * @param comptRendu
     * @param idOpe
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AjouterCompteRendu")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AjouterCompteRendu", targetNamespace = "http://WS.com/", className = "com.ws.AjouterCompteRendu")
    @ResponseWrapper(localName = "AjouterCompteRenduResponse", targetNamespace = "http://WS.com/", className = "com.ws.AjouterCompteRenduResponse")
    @Action(input = "http://WS.com/Medical/AjouterCompteRenduRequest", output = "http://WS.com/Medical/AjouterCompteRenduResponse")
    public String ajouterCompteRendu(
        @WebParam(name = "ID_ope", targetNamespace = "")
        int idOpe,
        @WebParam(name = "Compt_rendu", targetNamespace = "")
        String comptRendu);

}
