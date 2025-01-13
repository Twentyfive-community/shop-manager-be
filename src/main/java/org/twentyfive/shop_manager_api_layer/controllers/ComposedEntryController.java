package org.twentyfive.shop_manager_api_layer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.twentyfive.shop_manager_api_layer.dtos.requests.AddComposedEntryReq;
import org.twentyfive.shop_manager_api_layer.models.ComposedEntry;
import org.twentyfive.shop_manager_api_layer.services.ComposedEntryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/composed-entry")
public class ComposedEntryController {
    private final ComposedEntryService composedEntryService;

    @GetMapping("/getAll")
    public ResponseEntity<List<ComposedEntry>> getAll() {
        return ResponseEntity.ok().body(composedEntryService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity<Boolean> add(@RequestBody ComposedEntry composedEntry) {
        return ResponseEntity.ok().body(composedEntryService.add(composedEntry));
    }
}