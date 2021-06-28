package one.digitalinnovation.personaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/people")

public class PersonaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaapiApplication.class, args);
	}

	@GetMapping
	public String menssage(){
		return "Hello World!!";
	}

	@GetMapping("/hora")
    public LocalDate aviso(){
        LocalDate data = LocalDate.now();
        return data;
    }

}
