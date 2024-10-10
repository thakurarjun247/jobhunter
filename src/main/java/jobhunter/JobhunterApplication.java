package jobhunter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JobhunterApplication {


	public static void main(String[] args) {

		System.out.println("in main");
		SpringApplication.run(JobhunterApplication.class, args);
	}

}
