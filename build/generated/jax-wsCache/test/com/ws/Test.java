
package com.ws;

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
@WebService(name = "test", targetNamespace = "http://WS.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Test {


    /**
     * 
     * @param a
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://WS.com/", className = "com.ws.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://WS.com/", className = "com.ws.AddResponse")
    @Action(input = "http://WS.com/test/addRequest", output = "http://WS.com/test/addResponse")
    public String add(
        @WebParam(name = "a", targetNamespace = "")
        int a);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS.com/", className = "com.ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS.com/", className = "com.ws.HelloResponse")
    @Action(input = "http://WS.com/test/helloRequest", output = "http://WS.com/test/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
