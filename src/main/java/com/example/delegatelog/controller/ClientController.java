
package com.example.delegatelog.controller;

import com.example.delegatelog.model.Client;
import com.example.delegatelog.service.ClientService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/client/add")
    public String displayClientForm(Model model) {

        model.addAttribute("client", new Client());
        model.addAttribute("formAction", "/client/add");
        model.addAttribute("pageTitle", "Add Client");

        return "clientform";
    }

    @PostMapping("/client/add")
    public String processClientForm(
            @ModelAttribute("client") Client client) {

        service.addClient(client);

        return "redirect:/clients";
    }

    @GetMapping("/clients")
    public String displayClients(Model model) {

        List<Client> clients = service.getAllClients();

        model.addAttribute("clients", clients);

        return "clients";
    }

    @GetMapping("/client/{id}")
    public String viewClient(
            @PathVariable long id, Model model) {

        Client client = service.getClientById(id);

        if (client == null) {
            return "redirect:/clients";
        }

        model.addAttribute("client", client);

        return "clientdetails";
    }

    @GetMapping("/client/edit/{id}")
    public String editClient(
            @PathVariable long id, Model model) {

        Client client = service.getClientById(id);

        if (client == null) {
            return "redirect:/clients";
        }

        model.addAttribute("client", client);
        model.addAttribute("formAction", "/client/edit/" + id);
        model.addAttribute("pageTitle", "Edit Client");

        return "clientform";
    }

    @PostMapping("/client/edit/{id}")
    public String updateClient(
            @PathVariable long id,
            @ModelAttribute("client") Client client) {

        service.updateClient(id, client);

        return "redirect:/client/" + id;
    }

    @GetMapping("/menu")
    public String displayMenu(){
        return "menu";
    }
}
