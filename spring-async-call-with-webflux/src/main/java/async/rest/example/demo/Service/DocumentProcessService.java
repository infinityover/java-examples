package async.rest.example.demo.Service;

import async.rest.example.demo.model.DocumentProcess;

public interface DocumentProcessService {
    DocumentProcess createDocumentProcess(Integer clientId, String client);
}
