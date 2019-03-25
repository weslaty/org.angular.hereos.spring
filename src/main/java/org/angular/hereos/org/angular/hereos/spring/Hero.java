package org.angular.hereos.org.angular.hereos.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class Hero {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String name;

	public Hero(String name) {
		super();
		this.name = name;
	}

}