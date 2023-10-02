package api.myfinancial.dto;


import api.myfinancial.model.*;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String contact;
    private String password;

    private AccountBalance balance;
}
