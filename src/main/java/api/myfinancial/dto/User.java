package api.myfinancial.dto;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.*;

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
    private double balance;

    private List<Expense> expenses = new ArrayList<>();
    private List<Earning> earnings = new ArrayList<>();
    private List<Investment> investments = new ArrayList<>();

}
