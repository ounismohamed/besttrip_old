package com.scrum.besttrip.model.repository;

import com.scrum.besttrip.model.Ville;
import org.springframework.data.repository.CrudRepository;

public interface VilleRepository extends CrudRepository<Ville,String> {

   Ville findByName(String name);
}
