package fr.laposte.plantdexexercice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.laposte.plantdexexercice.model.Plante;

@SpringBootApplication
public class PlantdexExerciceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantdexExerciceApplication.class, args);
	}
	
	@Bean
	List<Plante> getAll(){
		return new ArrayList<Plante>();
	}

}
