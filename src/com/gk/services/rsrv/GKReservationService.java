package com.gk.services.rsrv;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-03T16:15:21.784+05:30
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "GKReservationService", 
//                  wsdlLocation = "gkhotel.wsdl",
                  targetNamespace = "http://www.gk.com/schemas/rsrv") 
public class GKReservationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.gk.com/schemas/rsrv", "GKReservationService");
    public final static QName GKReservationServicePort = new QName("http://www.gk.com/schemas/rsrv", "GKReservationServicePort");
    static {
        URL url = GKReservationService.class.getResource("gkhotel.wsdl");
        if (url == null) {
            url = GKReservationService.class.getClassLoader().getResource("gkhotel.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(GKReservationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "gkhotel.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public GKReservationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GKReservationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GKReservationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GKReservationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GKReservationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GKReservationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IReservationService
     */
    @WebEndpoint(name = "GKReservationServicePort")
    public IReservationService getGKReservationServicePort() {
        return super.getPort(GKReservationServicePort, IReservationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IReservationService
     */
    @WebEndpoint(name = "GKReservationServicePort")
    public IReservationService getGKReservationServicePort(WebServiceFeature... features) {
        return super.getPort(GKReservationServicePort, IReservationService.class, features);
    }

}
