package com.orderCraftSpringApp.service;

import com.orderCraftSpringApp.model.Client;
import com.orderCraftSpringApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientService;

    public List<Client> getAllClients(){
        return  clientService.findAll();
    }
}
