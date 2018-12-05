package com.scrum.besttrip.rest;


import com.scrum.besttrip.model.Ville;
import com.scrum.besttrip.service.VilleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class VilleRestController {

    private VilleService villeService;

    public VilleRestController(VilleService villeService) {
        this.villeService = villeService;
    }

    @RequestMapping(method = RequestMethod.GET,
    path = "/api/besttrip/villes",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Ville> getVilles(){
        return villeService.getVilles();
    }

    @RequestMapping(method = RequestMethod.GET,
            path = "/api/besttrip/villes/names",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<String> getVillesName(){
        return villeService.getVillesName();
    }

    @RequestMapping(method = RequestMethod.GET,
            path = "/api/besttrip/villes/{ville}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Ville getVille(@PathVariable("ville") String name){
        return villeService.getVilleByName(name);
    }

}
