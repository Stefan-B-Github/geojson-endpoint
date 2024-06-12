package com.stefan.geojsonendpoint.controller;

import com.stefan.geojsonendpoint.entity.GeoJsonFootprint;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/properties")
public class GeoJsonEndpointController {

    //Needs to accept GeoJSON
    @PostMapping(params = {"areaOfInterest"})
    @CrossOrigin
    public ResponseEntity<GeoJsonFootprint> serveGeoJsonRequest(@RequestParam(value = "areaOfInterest") String areaOfInterest) {
        Double[] coordinates = new Double[4];
        coordinates[0] = 0d;
        coordinates[1] = 0d;
        coordinates[2] = 0d;
        coordinates[4] = 0d;
        GeoJsonFootprint footprint = new GeoJsonFootprint("area is" + areaOfInterest,coordinates);
        return new ResponseEntity<>(footprint, HttpStatus.OK);
    }

}