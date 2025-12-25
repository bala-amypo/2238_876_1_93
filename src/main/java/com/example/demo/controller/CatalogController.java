package com.example.demo.controller;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping("/ingredients")
    public ResponseEntity<ActiveIngredient> addIngredient(
            @RequestBody ActiveIngredient ingredient) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(catalogService.addIngredient(ingredient));
    }

    @PostMapping("/medications")
    public ResponseEntity<Medication> addMedication(
            @RequestBody Medication medication) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(catalogService.addMedication(medication));
    }

    @GetMapping("/medications")
    public ResponseEntity<?> getAllMedications() {
        return ResponseEntity.ok(catalogService.getAllMedications());
    }
}
