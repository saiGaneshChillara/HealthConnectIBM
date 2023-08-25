package app.hackChallenge.HealthConnectIBM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HealthConnectIbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthConnectIbmApplication.class, args);
	}
	@GetMapping("/")
	public ResponseEntity<String> appRoot() {
		return new ResponseEntity<String>("Welcome to Health Connect",HttpStatus.OK);
	}


}
