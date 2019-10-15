/**
 * EmployeeServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package employee;

public class EmployeeServiceServiceLocator extends org.apache.axis.client.Service implements employee.EmployeeServiceService {

    public EmployeeServiceServiceLocator() {
    }


    public EmployeeServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeServicePort
    private java.lang.String EmployeeServicePort_address = "http://localhost:9000/employee";

    public java.lang.String getEmployeeServicePortAddress() {
        return EmployeeServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeServicePortWSDDServiceName = "EmployeeServicePort";

    public java.lang.String getEmployeeServicePortWSDDServiceName() {
        return EmployeeServicePortWSDDServiceName;
    }

    public void setEmployeeServicePortWSDDServiceName(java.lang.String name) {
        EmployeeServicePortWSDDServiceName = name;
    }

    public employee.EmployeeService getEmployeeServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeServicePort(endpoint);
    }

    public employee.EmployeeService getEmployeeServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            employee.EmployeeServicePortBindingStub _stub = new employee.EmployeeServicePortBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeServicePortEndpointAddress(java.lang.String address) {
        EmployeeServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (employee.EmployeeService.class.isAssignableFrom(serviceEndpointInterface)) {
                employee.EmployeeServicePortBindingStub _stub = new employee.EmployeeServicePortBindingStub(new java.net.URL(EmployeeServicePort_address), this);
                _stub.setPortName(getEmployeeServicePortWSDDServiceName());
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
        if ("EmployeeServicePort".equals(inputPortName)) {
            return getEmployeeServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "EmployeeServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "EmployeeServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeServicePort".equals(portName)) {
            setEmployeeServicePortEndpointAddress(address);
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
