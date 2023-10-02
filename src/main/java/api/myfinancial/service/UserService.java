package api.myfinancial.service;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return this.userRepository.findAll();
    }
    public User create(User user) {
        return this.userRepository.save(user);
    }

}
