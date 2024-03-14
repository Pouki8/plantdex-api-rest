package fr.laposte.plantdexexercice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import fr.laposte.plantdexexercice.model.Plante;

public interface PlanteRepository extends JpaRepository<Plante, Integer> {
	
	
}
