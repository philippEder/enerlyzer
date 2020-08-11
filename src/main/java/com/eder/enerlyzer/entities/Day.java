package com.eder.enerlyzer.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "day")
public class Day {

    Integer id;

    Calendar date;
    RatedFactor energy;
    Rating social;
    Rating work;

    Set<Meal> meals = new HashSet<>();

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "morningRating", column = @Column(name = "morningEngergy")),
            @AttributeOverride( name = "afternoonRating", column = @Column(name = "afternoonEngergy")),
            @AttributeOverride( name = "eveningRating", column = @Column(name = "eveningEngergy"))
    })
    public RatedFactor getEnergy(){
        return energy;
    }

    @OneToMany(mappedBy = "day")
    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "social")
    public Rating getSocial() {
        return social;
    }

    public void setSocial(Rating social) {
        this.social = social;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "work")
    public Rating getWork() {
        return work;
    }

    public void setWork(Rating work) {
        this.work = work;
    }
}
