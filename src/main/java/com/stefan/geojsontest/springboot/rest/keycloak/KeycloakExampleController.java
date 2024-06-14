package com.stefan.geojsontest.springboot.rest.keycloak;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.stefan.geojsontest.springboot.rest.geojson.GeoJsonFootprint;

import jakarta.annotation.security.RolesAllowed;

@RestController
public class KeycloakExampleController {

    @GetMapping("/anonymous")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("anonymous");
    }

    @RolesAllowed("user")
    @GetMapping(value="/user")
    public ResponseEntity<String> user() {
        return ResponseEntity.ok("user");
    }

    @RolesAllowed("admin")
    @GetMapping(value="/admin")
    public ResponseEntity<String> admin() {
        return ResponseEntity.ok("admin");
    }

    //Needs to accept GeoJSON
    @PostMapping(value = "/properties", params = {"areaOfInterest"})
    @RolesAllowed("user")
    public ResponseEntity<GeoJsonFootprint> serveGeoJsonRequest(@RequestParam(value = "areaOfInterest") String areaOfInterest) {
        Double[] coordinates = new Double[4];
        coordinates[0] = 0d;
        coordinates[1] = 1d;
        coordinates[2] = 2d;
        coordinates[4] = 3d;
        GeoJsonFootprint footprint = new GeoJsonFootprint("area is" + areaOfInterest,coordinates);
        return ResponseEntity.ok(footprint);
    }



}
