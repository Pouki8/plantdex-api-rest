package fr.laposte.plantdexexercice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.laposte.plantdexexercice.model.Categorie;
import fr.laposte.plantdexexercice.model.Ensoleillement;
import fr.laposte.plantdexexercice.model.Plante;
import fr.laposte.plantdexexercice.repository.CategorieRepository;
import fr.laposte.plantdexexercice.repository.PlanteRepository;

@SpringBootTest
class PlantdexExerciceApplicationTests {
	
	@Autowired
	private PlanteRepository plante;
	
	@Autowired
	private CategorieRepository categorie;

	@Test
	void clean() {
		plante.deleteAll();
		categorie.deleteAll();
	}
	
	@Test
	void createData() {
		
		//Création des catégories
		Categorie plantesFleuries = new Categorie();
		plantesFleuries.setLabel("Plantes fleuries");
		categorie.save(plantesFleuries);
		
		Categorie orchides = new Categorie();
		orchides.setLabel("Orchidés");
		categorie.save(orchides);

		
		Categorie cactus = new Categorie();
		cactus.setLabel("Cactus et plantes grasses");
		categorie.save(cactus);
		
		Categorie bonsais = new Categorie();
		bonsais.setLabel("Bonsaïs");
		categorie.save(bonsais);
		
		Categorie planteVerte = new Categorie();
		planteVerte.setLabel("Plantes vertes");
		categorie.save(planteVerte);
		
		Categorie palmier = new Categorie();
		palmier.setLabel("Palmiers d'intérieur");
		categorie.save(palmier);
		
		//Création des plantes
		Plante plant1 = new Plante();
		plant1.setNom("Anthurium");
		plant1.setEnsoleillement(Ensoleillement.MOYEN);
		plant1.setArrosage(2);
		plant1.setCategorie(plantesFleuries);
		plante.save(plant1);
		
		
		Plante plant2 = new Plante();
		plant2.setNom("Plante 2");
		plant2.setEnsoleillement(Ensoleillement.PEU);
		plant2.setArrosage(3);
		plant2.setCategorie(palmier);
		plante.save(plant2);
		
		
		Plante plant3 = new Plante();
		plant3.setNom("Plante 2");
		plant3.setEnsoleillement(Ensoleillement.BEAUCOUP);
		plant3.setArrosage(0);
		plant3.setCategorie(cactus);
		plante.save(plant3);
	
	}

}
