package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Client;

import com.orderCraftSpringApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/addClient")
    public  String addClient(){
        return "Client/addClient";
    }

    @PostMapping("/saveClient")
    public  String saveClient(Client client){
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/editClient/{id}")
    public String editClient(@PathVariable Long id, Model model) {
        Client client = clientService.getClientById(id).orElseThrow(() -> new RuntimeException("Client not found")); // Adjust the exception handling
        model.addAttribute("client", client);
        return "Client/editClient";
    }

    @PostMapping("/updateClient")
    public String updateClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "redirect:/clients";
    }
}
