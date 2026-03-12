package buoi5.bt5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "buoi5.bt5.repository")
@EntityScan(basePackages = "buoi5.bt5.model")
public class Bt5Application {

	public static void main(String[] args) {
		SpringApplication.run(Bt5Application.class, args);
	}

}
