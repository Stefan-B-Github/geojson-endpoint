package com.stefan.geojsontest.springboot.rest.geojson;

public class GeoJsonFootprint {

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

    public String toString() {
        return "FISH ADD";
    }
}
