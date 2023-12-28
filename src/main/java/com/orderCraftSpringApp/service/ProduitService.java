package com.orderCraftSpringApp.service;

import com.orderCraftSpringApp.model.Produit;
import com.orderCraftSpringApp.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository userRepository;

    public List<Produit> getAllProduits(){
        return userRepository.findAll();
    };
}
