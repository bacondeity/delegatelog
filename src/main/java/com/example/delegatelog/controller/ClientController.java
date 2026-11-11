package com.example.delegatelog.controller;
import com.example.delegatelog.model.Client;
import com.example.delegatelog.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller

public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service){
        this.service = service;
    }

    @GetMapping("/client/add")
    public String displayClientForm(Model model){
        System.out.println("Check");
        model.addAttribute("client", new Client());
        return "clientform";
    }

    @PostMapping("/client/add")
    public String processClientForm(@ModelAttribute("client") Client client){
        System.out.println("[Inside Process]");
        service.addClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/clients")
    public String displayClients(Model model){
        List<Client> clients = service.getAllClients();
        model.addAttribute("clients", clients);
        return "clients";
    }

    @GetMapping("/client/{id}")
    public String viewClient(@PathVariable long id, Model model){
        Client client = service.getClientById(id);
        model.addAttribute("client", client);
        if (client == null){
            return "redirect:/clients";
        }
        model.addAttribute("clients", client);
        return "clientdetails";
    }
}
