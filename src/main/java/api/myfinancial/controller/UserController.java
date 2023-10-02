package api.myfinancial.controller;

import api.myfinancial.dto.*;
import api.myfinancial.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return this.userService.create(user);
    }

}
