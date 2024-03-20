package fr.laposte.plantdexexercice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.laposte.plantdexexercice.model.Categorie;
import fr.laposte.plantdexexercice.repository.CategorieRepository;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/categorie")
@Log4j2
public class CategorieController {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
    @GetMapping
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }
    
	@GetMapping("/{id}")
	public Categorie getOne(@PathVariable int id) {
		return categorieRepository.findById(id).orElse(null);
	}
	
	@PostMapping
	public void addCategorie(@RequestBody Categorie categorie){
		categorieRepository.save(categorie);
		log.info(categorie);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOnePlante(@PathVariable int id){
		categorieRepository.deleteById(id);
	}

}
