package com.eder.enerlyzer.entities;


import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class RatedFactor {

    Rating morningRating;
    Rating afternoonRating;
    Rating eveningRating;

    @Enumerated(EnumType.STRING)
    public Rating getMorningRating() {
        return morningRating;
    }

    public void setMorningRating(Rating morningRating) {
        this.morningRating = morningRating;
    }

    @Enumerated(EnumType.STRING)
    public Rating getAfternoonRating() {
        return afternoonRating;
    }

    public void setAfternoonRating(Rating afternoonRating) {
        this.afternoonRating = afternoonRating;
    }

    @Enumerated(EnumType.STRING)
    public Rating getEveningRating() {
        return eveningRating;
    }

    public void setEveningRating(Rating eveningRating) {
        this.eveningRating = eveningRating;
    }
}
