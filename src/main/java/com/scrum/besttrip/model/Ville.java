package com.scrum.besttrip.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.bytebuddy.matcher.FilterableList;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="VILLE")
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="VILLE_ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name = "PAYS")
    private String pays;

    @Column(name="GUIDE")
    private String guide;


    @OneToMany(mappedBy = "ville", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Experience> experiences;

    public Ville(String nom, String pays) {
        this.name = nom;
        this.pays = pays;
        experiences = new ArrayList<>();
    }

    public Ville(){

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }
}
