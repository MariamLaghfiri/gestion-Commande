package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Produit;
import com.orderCraftSpringApp.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/produits")
    public  String listProduit(Model model){
        List<Produit> produits = produitService.getAllProduits();
        produits.forEach(System.out::println);
        model.addAttribute("produits",produits);
        return "Produit/produits";
    }
}
