package ir.csp.springproj.users.controler;

import ir.csp.springproj.users.model.Users;
import ir.csp.springproj.users.model.UsersModel;
import ir.csp.springproj.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping(value = "/new_user",produces = "application/json")
    public UsersModel newUser(@RequestBody UsersModel user){
        return usersService.NewUser(user);
    }

    @GetMapping(value = "/get_all",produces = "application/json")
    public List<UsersModel> getAllUsers(){
        return usersService.getAllUsers();
    }
}
