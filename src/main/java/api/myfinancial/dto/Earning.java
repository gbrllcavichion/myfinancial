package api.myfinancial.dto;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "earning")
public class Earning {

    @Id
    private String id;
    private double amount;
    private Date date;
}
