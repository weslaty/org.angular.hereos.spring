package org.angular.hereos.org.angular.hereos.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
//@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
public class TourOfHeroesController {
	
	@Autowired
	IHeroService serviceHero;

	@GetMapping("/")
	public List<Hero> getAll() {
		/*List<Hero> heroes = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			heroes.add(new Hero(i, "Hero-" + i));
		}
		return heroes;*/
		return serviceHero.findAll();
	}
	
	@GetMapping("/name/{name}")
	public List<Hero> search(@PathVariable String name) {
		return serviceHero.findByLikeName(name);
	}
	
	@GetMapping("/{id}")
	public Hero get(@PathVariable Integer id) {
		return serviceHero.find(id).isPresent()?serviceHero.find(id).get():null;
	}
	
	@PutMapping("/")
	public Hero put(@RequestBody Hero hero) {
		serviceHero.save(hero);
		return hero;
	}
	
	@PostMapping("/")
	public Hero add(@RequestBody Hero hero) {
		serviceHero.save(hero);
		return hero;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		serviceHero.delete(id);
	}
	
}
