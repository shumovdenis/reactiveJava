package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Team {
    @Id
    Long id;
    String name;
    String description;
    int logo;
    List<User> users;
    Date createDate;
    int amountUsers;
}
