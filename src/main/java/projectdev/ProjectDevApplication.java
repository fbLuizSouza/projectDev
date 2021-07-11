package projectdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projectdev.service.AtivoServiceImp;

@SpringBootApplication
public class ProjectDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDevApplication.class, args);
    }

}
