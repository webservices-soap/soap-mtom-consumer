package org.example.uploadfile.mtom.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-06T15:23:40.459+05:30
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "UploadFile", 
                  wsdlLocation = "file:/C:/Users/basanta.kumar.hota/workspace/WebserviceUploadData/src/main/resources/com/wud/wsdl/UploadFile.wsdl",
                  targetNamespace = "http://www.example.org/UploadFile/mtom/service") 
public class UploadFile extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/UploadFile/mtom/service", "UploadFile");
    public final static QName UploadServiceSOAPPort = new QName("http://www.example.org/UploadFile/mtom/service", "UploadServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/basanta.kumar.hota/workspace/WebserviceUploadData/src/main/resources/com/wud/wsdl/UploadFile.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UploadFile.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/basanta.kumar.hota/workspace/WebserviceUploadData/src/main/resources/com/wud/wsdl/UploadFile.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UploadFile(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UploadFile(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UploadFile() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UploadFile(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UploadFile(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UploadFile(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UploadService
     */
    @WebEndpoint(name = "UploadServiceSOAPPort")
    public UploadService getUploadServiceSOAPPort() {
        return super.getPort(UploadServiceSOAPPort, UploadService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UploadService
     */
    @WebEndpoint(name = "UploadServiceSOAPPort")
    public UploadService getUploadServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(UploadServiceSOAPPort, UploadService.class, features);
    }

}