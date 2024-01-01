package com.example.kelanisteam.service;

import com.example.kelanisteam.model.TShirtOrder;
import com.example.kelanisteam.repository.TShirtOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TShirtOrderService {

    private final TShirtOrderRepository tShirtOrderRepository;

    @Autowired
    public TShirtOrderService(TShirtOrderRepository tShirtOrderRepository) {
        this.tShirtOrderRepository = tShirtOrderRepository;
    }

    public List<TShirtOrder> getAllTShirtOrders() {
        return tShirtOrderRepository.findAll();
    }

    public TShirtOrder saveTShirtOrder(TShirtOrder tShirtOrder) {
        return tShirtOrderRepository.save(tShirtOrder);
    }
}
