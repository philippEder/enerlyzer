package com.eder.enerlyzer.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "meal")
public class Meal {

    Integer id;

    Calendar consumationTime;
    Integer amount;
    Integer carbs;

    Day day;
    Set<Nutrient> nutritions = new HashSet<>();

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "consumation_time", nullable = false)
    public Calendar getConsumationTime() {
        return consumationTime;
    }

    public void setConsumationTime(Calendar consumationTime) {
        this.consumationTime = consumationTime;
    }

    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Column(name = "carbs")
    public Integer getCarbs() {
        return carbs;
    }

    public void setCarbs(Integer carbs) {
        this.carbs = carbs;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "day", foreignKey = @ForeignKey(name = "FK_meal_to_day"))
    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @OneToMany(mappedBy = "meal")
    public Set<Nutrient> getNutritions() {
        return nutritions;
    }

    public void setNutritions(Set<Nutrient> nutritions) {
        this.nutritions = nutritions;
    }
}
