package api.myfinancial.service;

import api.myfinancial.dto.*;

import java.util.*;

public interface UserService {

    public List<User> getAllUsers();
    public User createUser(User user);

}
