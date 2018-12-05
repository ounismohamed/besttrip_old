package com.scrum.besttrip.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EXPERIENCE")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EXP_ID")
    private int id;

    @ManyToOne
    @JoinColumn(name ="VILLE_ID")
    @JsonBackReference
    private Ville ville;

    @ElementCollection
    @CollectionTable(name = "ACTIVITIES")
    private List<String> activites;

    @ElementCollection
    @CollectionTable(name = "PHOTOS")
    private List<String> photos;

    @Column(name = "RECOMMANDATION")
    private int recommandation;

    public Experience(){
        activites = new ArrayList<>();
        photos = new ArrayList<>();
        recommandation=0;

    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public List<String> getActivites() {
        return activites;
    }

    public void setActivites(List<String> activites) {
        this.activites = activites;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public int getRecommandation() {
        return recommandation;
    }

    public void setRecommandation(int recommandation) {
        this.recommandation = recommandation;
    }
}
