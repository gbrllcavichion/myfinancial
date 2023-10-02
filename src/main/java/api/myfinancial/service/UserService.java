package api.myfinancial.service;

import api.myfinancial.dto.*;

import java.util.*;

public interface UserService {

     List<User> getAll();
     User create(User user);
     User update(String id, User user);
     User delete(String id);
     Optional<User> findById(String id);
}
