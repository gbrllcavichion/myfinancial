package api.myfinancial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public void getAllUsers() {

    }

    @PostMapping
    public void createUser(@RequestBody Object usuario) {

    }
}
