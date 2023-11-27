package api.myfinancial.domain;

import api.myfinancial.dto.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    @Query("{'user.id': ?0}")
    List<Expense> findByUserId(String userId);
}
