package client.config;

import employee.EmployeeService;
import employee.EmployeeServiceServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {
    @Bean
    EmployeeService employeeServiceService() throws ServiceException {
        return new EmployeeServiceServiceLocator().getEmployeeServicePort();
    }
}
