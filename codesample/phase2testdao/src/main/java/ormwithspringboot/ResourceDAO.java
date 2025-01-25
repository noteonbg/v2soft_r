package ormwithspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceDAO extends JpaRepository<Resource, Integer> {

	// all my insert,update, delete, select all is already taken care automatically
	//without me writing one line of code..
	//spring +hibernate = hibernate becomes easier..
}
