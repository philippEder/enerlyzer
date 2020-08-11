package com.eder.enerlyzer.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity(name = "Day")
public class Day {

    Integer id;

    Calendar date;

    Energy morningEnergy;
    Energy afternoonEnergy;
    Energy eveningEnergy;

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Transient
    public Energy getMorningEnergy() {
        return morningEnergy;
    }

    public void setMorningEnergy(Energy morningEnergy) {
        this.morningEnergy = morningEnergy;
    }
    @Transient
    public Energy getAfternoonEnergy() {
        return afternoonEnergy;
    }

    public void setAfternoonEnergy(Energy afternoonEnergy) {
        this.afternoonEnergy = afternoonEnergy;
    }
    @Transient
    public Energy getEveningEnergy() {
        return eveningEnergy;
    }

    public void setEveningEnergy(Energy eveningEnergy) {
        this.eveningEnergy = eveningEnergy;
    }
}
