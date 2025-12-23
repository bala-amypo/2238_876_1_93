package com.example.demo.controller;

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

    @PostMapping("/medications")
    public ResponseEntity<Medication> addMedication(@RequestBody Medication medication) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(catalogService.addMedication(medication));
    }

    @GetMapping("/medications")
    public ResponseEntity<?> getAllMedications() {
        return ResponseEntity.ok(catalogService.getAllMedications());
    }

    @PutMapping("/medications/{id}")
    public ResponseEntity<Medication> updateMedication(
            @PathVariable Long id,
            @RequestBody Medication medication
    ) {
        medication.setId(id);
        return ResponseEntity.ok(catalogService.addMedication(medication));
    }

    @DeleteMapping("/medications/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long id) {
        catalogService.deleteMedication(id);
        return ResponseEntity.noContent().build();
    }
}
