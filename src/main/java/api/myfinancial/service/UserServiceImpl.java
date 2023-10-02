package api.myfinancial.service;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;

import java.util.*;

public class UserServiceImpl extends UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }
}
