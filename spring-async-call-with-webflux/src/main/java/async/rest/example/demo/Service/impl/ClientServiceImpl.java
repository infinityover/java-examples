package async.rest.example.demo.Service.impl;

import async.rest.example.demo.Repository.ClientRepository;
import async.rest.example.demo.Service.ClientService;
import async.rest.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(String nome) {

        return clientRepository.save(Client.builder().name(nome).build());
    }
}
