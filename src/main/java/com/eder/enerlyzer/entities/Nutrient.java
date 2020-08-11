package com.eder.enerlyzer.entities;

import javax.persistence.*;

@Entity(name = "nutrient")
public class Nutrient {

    Integer id;

    NutrientType type;
    Integer amount;

    Meal meal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    public NutrientType getType() {
        return type;
    }

    public void setType(NutrientType type) {
        this.type = type;
    }

    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal", foreignKey = @ForeignKey(name = "FK_nutrient_to_meal"))
    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
