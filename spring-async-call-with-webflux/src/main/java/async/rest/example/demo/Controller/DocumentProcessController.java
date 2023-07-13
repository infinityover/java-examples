package async.rest.example.demo.Controller;

import async.rest.example.demo.Service.ClientService;
import async.rest.example.demo.Service.DocumentProcessService;
import async.rest.example.demo.model.Client;
import async.rest.example.demo.model.DocumentProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("documents")
public class DocumentProcessController {
    @Autowired
    private DocumentProcessService documentProcessService;

    @GetMapping(path = "/{id}/{name}" , produces = "application/json")
    public DocumentProcess createClient(@PathVariable Integer id,
                               @PathVariable String name) {

        return documentProcessService.createDocumentProcess(id,name);
    }
}