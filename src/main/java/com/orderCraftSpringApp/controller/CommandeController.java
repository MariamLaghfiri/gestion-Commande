package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Commande;
import com.orderCraftSpringApp.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @GetMapping("/commandes")
    public String listCommade(Model model){
        List<Commande> commandes = commandeService.getAllCommandes();
        commandes.forEach(System.out::println);
        model.addAttribute("commandes",commandes);
        return "Commande/commandes";
    }

}
