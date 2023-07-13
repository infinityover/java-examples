package async.rest.example.demo.Controller;

import async.rest.example.demo.Service.ClientService;
import async.rest.example.demo.model.Client;
import async.rest.example.demo.model.DocumentProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

        @GetMapping(path = "/{id}/{name}" , produces = "application/json")
        public Client createClient(@PathVariable String id,
                              @PathVariable String name) {
            Client client = clientService.createClient(id);
            Flux<DocumentProcess> documentProcessFlux = WebClient.create("http://localhost:8080")
                    .get()
                    .uri(uriBuilder -> uriBuilder.path("/documents/{id}/{name}").build(id, name))
                    .retrieve()
                    .bodyToFlux(DocumentProcess.class);
            documentProcessFlux.subscribe(documentProcess -> System.out.println(documentProcess));


            return client;
        }


}
