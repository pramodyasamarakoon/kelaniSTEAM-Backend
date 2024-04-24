package com.example.kelanisteam.controller;

import com.example.kelanisteam.model.TShirtOrder;
import com.example.kelanisteam.service.TShirtOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Date;
import java.util.Comparator;


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
    public ResponseEntity<List<TShirtOrder>> getAllTShirtOrders() {
        List<TShirtOrder> allTShirtOrders = tShirtOrderService.getAllTShirtOrders();

        // Sort the list by createdDate in descending order (latest orders first)
        allTShirtOrders.sort(Comparator.comparing(TShirtOrder::getCreatedDate).reversed());

        if (!allTShirtOrders.isEmpty()) {
            return ResponseEntity.ok(allTShirtOrders);
        } else {
            return ResponseEntity.noContent().build();
        }
    }





    @PostMapping("/addTShirtOrder")
    public ResponseEntity<TShirtOrder> createTShirtOrder(@RequestBody TShirtOrder tShirtOrder) {
        // Set the createdDate property to the current date
        tShirtOrder.setCreatedDate(new Date());

        TShirtOrder savedTShirtOrder = tShirtOrderService.saveTShirtOrder(tShirtOrder);
        return new ResponseEntity<>(savedTShirtOrder, HttpStatus.CREATED);
    }



    // Add more endpoints as needed
}
