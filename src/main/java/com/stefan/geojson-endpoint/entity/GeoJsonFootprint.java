package com.stefan.geojsonendpoint.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeoJsonFootprint {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String type;
    private Double[] coordinates;

    public GeoJsonFootprint(String type, Double[] coordinates) {
        this.type = type;
        setCoordinates(coordinates);
    }

    public GeoJsonFootprint() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double[] getCoordinates(){
        return coordinates;
    }

    public void setCoordinates(Double[] coordinates){
        if (coordinates.length != 4) {
            throw new IllegalArgumentException("Coordinates must have exactly four elements");
        }
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "FISH ADD";
    }
}
