package org.angular.hereos.org.angular.hereos.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService implements IHeroService {
	
	@Autowired
	HeroRepository heroRepository;

	@Override
	public List<Hero> findAll() {
		return (List<Hero>) heroRepository.findAll();
	}
	
	@Override
	public Optional<Hero> find(Integer id) {
		return heroRepository.findById(id);
	}
	
	@Override
	public List<Hero> findByLikeName(String name) {
		return heroRepository.findByLikeName(name);
	}
	
	@Override
	public void save(Hero hero) {
		heroRepository.save(hero);
	}
	
	@Override
	public void delete(Integer id) {
		Hero hero = new Hero();
		hero.setId(id);
		heroRepository.delete(hero);
	}
	
	

}
