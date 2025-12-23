package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping("/medications")
    public ResponseEntity<Medication> addMedication(
            @RequestBody Medication medication
    ) {
        Medication saved = catalogService.addMedication(medication);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/medications")
    public List<Medication> getAllMedications() {
        return catalogService.getAllMedications();
    }
}
