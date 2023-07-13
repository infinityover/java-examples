package async.rest.example.demo.Repository;

import async.rest.example.demo.model.DocumentProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentProcessRepository extends JpaRepository<DocumentProcess, Integer> {
}
