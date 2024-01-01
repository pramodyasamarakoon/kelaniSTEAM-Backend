package com.example.kelanisteam.controller;

import com.example.kelanisteam.model.TShirtOrder;
import com.example.kelanisteam.service.TShirtOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tshirt-orders")
@CrossOrigin(origins = "http://localhost:3000")
public class TShirtOrderController {

    private final TShirtOrderService tShirtOrderService;

    @Autowired
    public TShirtOrderController(TShirtOrderService tShirtOrderService) {
        this.tShirtOrderService = tShirtOrderService;
    }

    @GetMapping("/getAll")
    public List<TShirtOrder> getAllTShirtOrders() {
        return tShirtOrderService.getAllTShirtOrders();
    }

    @PostMapping("/addTShirtOrder")
    public ResponseEntity<TShirtOrder> createTShirtOrder(@RequestBody TShirtOrder tShirtOrder) {
        TShirtOrder savedTShirtOrder = tShirtOrderService.saveTShirtOrder(tShirtOrder);
        return new ResponseEntity<>(savedTShirtOrder, HttpStatus.CREATED);
    }

    // Add more endpoints as needed
}
