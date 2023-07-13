package async.rest.example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table
@Entity
@Data
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
