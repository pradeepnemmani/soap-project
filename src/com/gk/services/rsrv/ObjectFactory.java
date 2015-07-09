
package com.gk.services.rsrv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gk.services.rsrv package. 
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

    private final static QName _OnDate_QNAME = new QName("http://www.gk.com/schemas/rsrv", "onDate");
    private final static QName _ReservationRequest_QNAME = new QName("http://www.gk.com/schemas/rsrv", "reservationRequest");
    private final static QName _ReservationId_QNAME = new QName("http://www.gk.com/schemas/rsrv", "reservationId");
    private final static QName _Available_QNAME = new QName("http://www.gk.com/schemas/rsrv", "available");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gk.services.rsrv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservationRequest }
     * 
     */
    public ReservationRequest createReservationRequest() {
        return new ReservationRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gk.com/schemas/rsrv", name = "onDate")
    public JAXBElement<XMLGregorianCalendar> createOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OnDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gk.com/schemas/rsrv", name = "reservationRequest")
    public JAXBElement<ReservationRequest> createReservationRequest(ReservationRequest value) {
        return new JAXBElement<ReservationRequest>(_ReservationRequest_QNAME, ReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gk.com/schemas/rsrv", name = "reservationId")
    public JAXBElement<String> createReservationId(String value) {
        return new JAXBElement<String>(_ReservationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gk.com/schemas/rsrv", name = "available")
    public JAXBElement<Boolean> createAvailable(Boolean value) {
        return new JAXBElement<Boolean>(_Available_QNAME, Boolean.class, null, value);
    }

}
