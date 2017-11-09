package com.umg.zoo.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Cristian Ramírez on 8/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "breed")
    private String breed;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "photo")
    private byte[] photo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idLocation")
    private Location location;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSupervisor")
    private User supervisor;
    @ManyToMany
    @JoinTable(name = "animal_meal", joinColumns = @JoinColumn(name = "animal_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_id"))
    private Set<Meal> meals;

    public Animal() {
    }

    public Animal(String breed, String name, String gender, int age, byte[] photo, Location location, User supervisor) {
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.photo = photo;
        this.location = location;
        this.supervisor = supervisor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }
}
