package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Client;
import com.orderCraftSpringApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String listClient(Model model){
        List<Client> clients = clientService.getAllClients();
        clients.forEach(System.out::println);
        model.addAttribute("clients",clients);
        return "Client/client";
    }
}
