package com.scrum.besttrip.service;

import com.scrum.besttrip.model.Experience;
import com.scrum.besttrip.model.Ville;
import com.scrum.besttrip.model.repository.VilleRepository;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VilleService {

    private VilleRepository villeRepository;

    public VilleService(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    public Iterable<Ville> getVilles (){
        return (List<Ville>) villeRepository.findAll();
    }

    public Iterable<String> getVillesName(){
        List<String> names = new ArrayList<>();
        villeRepository.findAll().forEach(e -> names.add(e.getName()));
        return names;
    }

    public Ville getVilleByName(String name){
        return villeRepository.findByName(name.toLowerCase());
    }


}
