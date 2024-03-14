package fr.laposte.plantdexexercice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.laposte.plantdexexercice.model.Categorie;
import fr.laposte.plantdexexercice.repository.CategorieRepository;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
    @GetMapping
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }
	

}
