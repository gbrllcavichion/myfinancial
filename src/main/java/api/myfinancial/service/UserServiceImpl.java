package api.myfinancial.service;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;

import java.util.*;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }
}
