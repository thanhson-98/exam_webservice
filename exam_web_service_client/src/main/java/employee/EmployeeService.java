/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package employee;

public interface EmployeeService extends java.rmi.Remote {
    public employee.Employee[] getEmployees() throws java.rmi.RemoteException;
    public employee.Employee getE(long arg0) throws java.rmi.RemoteException;
    public java.lang.String addEmployees(employee.Employee arg0) throws java.rmi.RemoteException;
    public employee.Employee updateEmployees(long arg0, employee.Employee arg1) throws java.rmi.RemoteException;
}
