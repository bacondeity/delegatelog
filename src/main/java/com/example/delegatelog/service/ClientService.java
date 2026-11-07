package com.example.delegatelog.service;

import com.example.delegatelog.db.ClientRepository;
import com.example.delegatelog.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ClientService {
    private final ClientRepository clientRepository;
    List<Client> clients = new ArrayList<>();

    public void addClient(Client c){
        clientRepository.save(c);
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
}