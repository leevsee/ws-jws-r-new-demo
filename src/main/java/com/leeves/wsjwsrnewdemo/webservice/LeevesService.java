
package com.leeves.wsjwsrnewdemo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LeevesService", targetNamespace = "http://webservice.wsjwsnewdemo.leeves.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LeevesService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "leevesService", targetNamespace = "http://webservice.wsjwsnewdemo.leeves.com/", className = "com.leeves.wsjwsrnewdemo.webservice.LeevesService_Type")
    @ResponseWrapper(localName = "leevesServiceResponse", targetNamespace = "http://webservice.wsjwsnewdemo.leeves.com/", className = "com.leeves.wsjwsrnewdemo.webservice.LeevesServiceResponse")
    public String leevesService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

}
