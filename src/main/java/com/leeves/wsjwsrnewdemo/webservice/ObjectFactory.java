
package com.leeves.wsjwsrnewdemo.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.leeves.wsjwsrnewdemo.webservice package. 
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

    private final static QName _LeevesService_QNAME = new QName("http://webservice.wsjwsnewdemo.leeves.com/", "leevesService");
    private final static QName _LeevesServiceResponse_QNAME = new QName("http://webservice.wsjwsnewdemo.leeves.com/", "leevesServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.leeves.wsjwsrnewdemo.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LeevesService_Type }
     * 
     */
    public LeevesService_Type createLeevesService_Type() {
        return new LeevesService_Type();
    }

    /**
     * Create an instance of {@link LeevesServiceResponse }
     * 
     */
    public LeevesServiceResponse createLeevesServiceResponse() {
        return new LeevesServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeevesService_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wsjwsnewdemo.leeves.com/", name = "leevesService")
    public JAXBElement<LeevesService_Type> createLeevesService(LeevesService_Type value) {
        return new JAXBElement<LeevesService_Type>(_LeevesService_QNAME, LeevesService_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeevesServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wsjwsnewdemo.leeves.com/", name = "leevesServiceResponse")
    public JAXBElement<LeevesServiceResponse> createLeevesServiceResponse(LeevesServiceResponse value) {
        return new JAXBElement<LeevesServiceResponse>(_LeevesServiceResponse_QNAME, LeevesServiceResponse.class, null, value);
    }

}
