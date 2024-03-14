package fr.laposte.plantdexexercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.laposte.plantdexexercice.model.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
