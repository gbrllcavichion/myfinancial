package api.myfinancial.domain;

import api.myfinancial.dto.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface EarningRepository extends MongoRepository<Earning, String> {
    @Query("{'user.id': ?0}")
    List<Earning> findByUserId(String userId);
}
