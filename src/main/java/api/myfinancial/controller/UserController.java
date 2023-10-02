package api.myfinancial.controller;

import api.myfinancial.dto.*;
import api.myfinancial.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
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

    @PutMapping(value = "/{id}")
    public User update(@PathVariable("id") String id, @RequestBody User user) {
        return this.userService.update(id, user);
    }

    @DeleteMapping(value = "/{id}")
    public User delete(@PathVariable("id") String id) {
        return this.userService.delete(id);
    }
}
