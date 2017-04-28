/**
 * PlantWSServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.plantplaces.ui;

public class PlantWSServiceServiceLocator extends org.apache.axis.client.Service implements com.plantplaces.ui.PlantWSServiceService {

    public PlantWSServiceServiceLocator() {
    }


    public PlantWSServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlantWSServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlantWSService
    private java.lang.String PlantWSService_address = "http://localhost:8080/PlantPlacesYAP/services/PlantWSService";

    public java.lang.String getPlantWSServiceAddress() {
        return PlantWSService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlantWSServiceWSDDServiceName = "PlantWSService";

    public java.lang.String getPlantWSServiceWSDDServiceName() {
        return PlantWSServiceWSDDServiceName;
    }

    public void setPlantWSServiceWSDDServiceName(java.lang.String name) {
        PlantWSServiceWSDDServiceName = name;
    }

    public com.plantplaces.ui.PlantWSService getPlantWSService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlantWSService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlantWSService(endpoint);
    }

    public com.plantplaces.ui.PlantWSService getPlantWSService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.plantplaces.ui.PlantWSServiceSoapBindingStub _stub = new com.plantplaces.ui.PlantWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPlantWSServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlantWSServiceEndpointAddress(java.lang.String address) {
        PlantWSService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.plantplaces.ui.PlantWSService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.plantplaces.ui.PlantWSServiceSoapBindingStub _stub = new com.plantplaces.ui.PlantWSServiceSoapBindingStub(new java.net.URL(PlantWSService_address), this);
                _stub.setPortName(getPlantWSServiceWSDDServiceName());
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
        if ("PlantWSService".equals(inputPortName)) {
            return getPlantWSService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ui.plantplaces.com", "PlantWSServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ui.plantplaces.com", "PlantWSService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlantWSService".equals(portName)) {
            setPlantWSServiceEndpointAddress(address);
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
