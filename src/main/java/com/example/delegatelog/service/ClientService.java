
package com.example.delegatelog.service;

import com.example.delegatelog.db.ClientRepository;
import com.example.delegatelog.model.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(Client c) {
        clientRepository.save(c);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void updateClient(long id, Client updatedClient) {

        Client existingClient =
                clientRepository.findById(id).orElse(null);

        if (existingClient != null) {

            existingClient.setSubmission(updatedClient.getSubmission());
            existingClient.setCrisisworker(updatedClient.getCrisisworker());
            existingClient.setFname(updatedClient.getFname());
            existingClient.setLname(updatedClient.getLname());
            existingClient.setAge(updatedClient.getAge());
            existingClient.setSex(updatedClient.getSex());
            existingClient.setJurisdiction(updatedClient.getJurisdiction());
            existingClient.setFacility(updatedClient.getFacility());
            existingClient.setNotes(updatedClient.getNotes());
            existingClient.setIdeation(updatedClient.getIdeation());
            existingClient.setActionable(updatedClient.getActionable());
            existingClient.setDetermination(updatedClient.isDetermination());

            clientRepository.save(existingClient);
        }
    }

    public List<Client> findByfname(String fname){
        return clientRepository.findByfname(fname);
    }
}
