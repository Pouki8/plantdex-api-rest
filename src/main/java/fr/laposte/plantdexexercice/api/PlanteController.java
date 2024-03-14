package fr.laposte.plantdexexercice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.laposte.plantdexexercice.model.Categorie;
import fr.laposte.plantdexexercice.model.Plante;
import fr.laposte.plantdexexercice.repository.CategorieRepository;
import fr.laposte.plantdexexercice.repository.PlanteRepository;
import lombok.extern.log4j.Log4j2;



@RestController
@RequestMapping("/api/plante")
@Log4j2
public class PlanteController {
	
	@Autowired
	private PlanteRepository planteRepository;
	@Autowired
	private List<Plante> plantes;
	@Autowired 


    @GetMapping
    public List<Plante> getAllPlantes() {
        return planteRepository.findAll();
    }
    
	@GetMapping("/{id}")
	public Plante getOne(@PathVariable int id) {
		return planteRepository.findById(id).orElse(null);
	}
		
	
	@PostMapping
	public void addPlante(@RequestBody Plante plante){
		planteRepository.save(plante);
		log.info(plante);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteOnePlante(@PathVariable int id){
		planteRepository.deleteById(id);
	}
    
    

}
