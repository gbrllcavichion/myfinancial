package api.myfinancial.service;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User update(String id, User user) {
        User updated = this.userRepository.findById(id).get();
        updated.setName(user.getName());
        updated.setEmail(user.getEmail());
        updated.setContact(user.getContact());
        updated.setPassword(user.getPassword());
        updated.setBalance(user.getBalance());

        return this.userRepository.save(updated);
    }

    @Override
    public User delete(String id) {
        User user = this.userRepository.findById(id).get();
        this.userRepository.deleteById(id);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

}
