package io.igventurelli.profile_example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Value("${app.running.env}")
    private String env;

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(Map.of("environment", env));
    }
}
