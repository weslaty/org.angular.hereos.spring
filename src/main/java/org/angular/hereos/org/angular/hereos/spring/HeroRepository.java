package org.angular.hereos.org.angular.hereos.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HeroRepository extends JpaRepository<Hero, Integer> {
	List<Hero> findByName(String name);

	@Query("Select h from Hero h where h.name like %:name%")
	List<Hero> findByLikeName(String name);
}
