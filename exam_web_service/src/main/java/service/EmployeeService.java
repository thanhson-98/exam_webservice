package service;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService()
public class EmployeeService {
    @WebMethod
    public String addEmployees(Employee employee) {
        final Session session = HibernateUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            return "save success!";
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
            return "save fail!";
        } finally {
            session.close();
        }
    }

    @WebMethod
    public List<Employee> getEmployees() {
        List<Employee> employees = HibernateUtil.getSession().createQuery("from Employee", Employee.class).list();
        return employees;
    }

    @WebMethod
    public Employee updateEmployees(long id, Employee employee) {
        Employee e = HibernateUtil.getSession().get(Employee.class, id);
        if (e != null) {
            e.setName(employee.getName());
            e.setSalary(employee.getSalary());
            return e;
        } else
            return null;
    }

    @WebMethod
    public Employee getE(long id) {
        Employee e = HibernateUtil.getSession().get(Employee.class, id);
        if (e == null)
            return null;
        else
            return e;
    }

}
