package com.stefan.geojsonendpoint;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;

import com.stefan.geojsonendpoint.controller.GeoJsonEndpointController;
import com.stefan.geojsonendpoint.entity.GeoJsonFootprint;

import ch.qos.logback.classic.pattern.PropertyConverter;

import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.mockito.InjectMocks;

@SpringBootTest
public class GeoJsonEndpointTests {

    @InjectMocks
    private GeoJsonEndpointController testController;

    @Test
    public void testGetExample() {
        assertTrue(2 > 1);
        System.out.println("Tests complete");
    }



}

