package io.igventurelli.oauth2_resource_server.controller;

import io.igventurelli.oauth2_resource_server.dto.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll() {
        return ResponseEntity.ok(List.of(
            new OrderDTO(1, "Order 1"),
            new OrderDTO(2, "Order 2"),
            new OrderDTO(3, "Order 3")
        ));
    }
}
