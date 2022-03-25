/**
 * CreditCardCheckerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package creditCardChecker.com.web.service;

public class CreditCardCheckerServiceLocator extends org.apache.axis.client.Service implements creditCardChecker.com.web.service.CreditCardCheckerService {

    public CreditCardCheckerServiceLocator() {
    }


    public CreditCardCheckerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditCardCheckerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditCardChecker
    private java.lang.String CreditCardChecker_address = "http://localhost:8080/CrunchifyWS/services/CreditCardChecker";

    public java.lang.String getCreditCardCheckerAddress() {
        return CreditCardChecker_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditCardCheckerWSDDServiceName = "CreditCardChecker";

    public java.lang.String getCreditCardCheckerWSDDServiceName() {
        return CreditCardCheckerWSDDServiceName;
    }

    public void setCreditCardCheckerWSDDServiceName(java.lang.String name) {
        CreditCardCheckerWSDDServiceName = name;
    }

    public creditCardChecker.com.web.service.CreditCardChecker getCreditCardChecker() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditCardChecker_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditCardChecker(endpoint);
    }

    public creditCardChecker.com.web.service.CreditCardChecker getCreditCardChecker(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            creditCardChecker.com.web.service.CreditCardCheckerSoapBindingStub _stub = new creditCardChecker.com.web.service.CreditCardCheckerSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreditCardCheckerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditCardCheckerEndpointAddress(java.lang.String address) {
        CreditCardChecker_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (creditCardChecker.com.web.service.CreditCardChecker.class.isAssignableFrom(serviceEndpointInterface)) {
                creditCardChecker.com.web.service.CreditCardCheckerSoapBindingStub _stub = new creditCardChecker.com.web.service.CreditCardCheckerSoapBindingStub(new java.net.URL(CreditCardChecker_address), this);
                _stub.setPortName(getCreditCardCheckerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CreditCardChecker".equals(inputPortName)) {
            return getCreditCardChecker();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.web.com.creditCardChecker", "CreditCardCheckerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.web.com.creditCardChecker", "CreditCardChecker"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditCardChecker".equals(portName)) {
            setCreditCardCheckerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
