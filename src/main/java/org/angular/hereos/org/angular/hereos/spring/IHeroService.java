package org.angular.hereos.org.angular.hereos.spring;

import java.util.List;
import java.util.Optional;

public interface IHeroService {
	
	public void save(Hero hero);

	public void delete(Integer id);

	public Optional<Hero> find(Integer id);

	public List<Hero> findAll();
	
	public List<Hero> findByLikeName(String name);

}
