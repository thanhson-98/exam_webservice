package endpoint;

import service.EmployeeService;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
//        member
        Endpoint.publish("http://localhost:9000/employee", new EmployeeService());
    }
}
