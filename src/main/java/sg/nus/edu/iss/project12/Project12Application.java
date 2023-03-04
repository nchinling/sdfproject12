package sg.nus.edu.iss.project12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project12Application {

	public static void main(String[] args) {
		// SpringApplication.run(Project12Application.class, args);
		SpringApplication app = new SpringApplication(Project12Application.class);
		app.run(args);
	}

}
