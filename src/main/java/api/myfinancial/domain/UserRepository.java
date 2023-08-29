package api.myfinancial.domain;

import api.myfinancial.dto.*;
import org.springframework.data.mongodb.repository.*;

public interface UserRepository extends MongoRepository<User, Long> {

}