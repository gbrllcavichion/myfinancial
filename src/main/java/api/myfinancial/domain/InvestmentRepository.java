package api.myfinancial.domain;

import api.myfinancial.dto.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface InvestmentRepository extends MongoRepository<User, String> {
    @Query("{'user.id': ?0}")
    List<Expense> findByUserId(String userId);
}
