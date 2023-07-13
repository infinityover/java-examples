package async.rest.example.demo.Service.impl;

import async.rest.example.demo.Repository.DocumentProcessRepository;
import async.rest.example.demo.Service.DocumentProcessService;
import async.rest.example.demo.model.DocumentProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentProcessServiceImpl implements DocumentProcessService {
    @Autowired
    private DocumentProcessRepository documentProcessRepository;

    @Override
    public DocumentProcess createDocumentProcess(Integer clientId, String client) {
        return documentProcessRepository.save(DocumentProcess.builder().clientId(clientId).nome(client).build());
    }
}
