package api.myfinancial.dto;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "investment")
public class Investment {

    @Id
    private String id;
    private Date date;
    private String description;
    private double valueBefore;
    private double amountToAdd;
    private double amoundAdded;
    private double currentBalance;
    private double totalAmountInvested;

}
