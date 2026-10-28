package com.example.delegatelog.service;

import com.example.delegatelog.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ClientService {
    List<Client> clients = new ArrayList<>();

    public void addClient(Client c){
        clients.add(c);
    }

    public List<Client> getAllClients(){
        return clients;
    }

    public ClientService(){
    }
}