package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
public class Project {
    @Id
    Long id;
    String name;
    String team;
    String description;
    int logo;
    Date startDate;
    Date endDate;
}
