package com.example.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootdemo.beans.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{
	// inherits all the methods of JpaRepository : save, delete, find
	// this will auto-implemented by spring data jpa its object will be ready to use in 
	// the service layer using @Autowired on the ProfileRepository variable
	
	/*
	 * you can always create a custom query method to perform operations based on other properties
	 * spring data JPA automatically implements
	 * 
	 * @Query("select p from com.example.springbootdemo.beans.Profile p where p.name = ?1")
	 * public Optional<Profile> findByName(String name)
	 */
}
