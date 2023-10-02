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

    public User update(String id, User user) {
        User updated = this.userRepository.findById(id).get();
        updated.setName(user.getName());
        updated.setEmail(user.getEmail());
        updated.setContact(user.getContact());
        updated.setPassword(user.getPassword());

        return this.userRepository.save(updated);
    }

    public User delete(String id) {
        User user = this.userRepository.findById(id).get();
        this.userRepository.deleteById(id);
        return user;
    }
}
