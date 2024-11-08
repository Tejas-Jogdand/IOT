import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }
}

class EmployeeService {
    public void addEmployee(String name) {
        System.out.println("Employee " + name + " added.");
    }
}
