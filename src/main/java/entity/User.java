package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "usr")
public class User {
    @Id
    Long id;
    String name;
    String phoneNumber;
}
