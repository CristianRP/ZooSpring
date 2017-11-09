package com.umg.zoo.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Cristian Ramírez on 8/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
@Entity
@Table(name = "meal")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "food")
    private String food;
    @ManyToMany(mappedBy = "meals")
    private Set<Animal> animals;

    public Meal() {
    }

    public Meal(String description, String food, Set<Animal> animals) {
        this.description = description;
        this.food = food;
        this.animals = animals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}