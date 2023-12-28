package com.orderCraftSpringApp.service;

import com.orderCraftSpringApp.model.Commande;
import com.orderCraftSpringApp.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public  List<Commande> getAllCommandes(){
        return commandeRepository.findAll();
    }

}
