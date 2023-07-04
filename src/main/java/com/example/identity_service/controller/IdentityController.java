package com.example.identity_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("identity")
public class IdentityController {
    @GetMapping
    public ResponseEntity<Object> get() {
        return ResponseEntity.ok("identity");
    }

    @PostMapping
    public ResponseEntity<Object> update(@RequestParam String message) {
        return ResponseEntity.ok(message);
    }
}
