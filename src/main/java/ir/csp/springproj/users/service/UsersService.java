package ir.csp.springproj.users.service;

import ir.csp.springproj.users.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {
    public Users NewUser(Users u);

    public List<Users> getAllUsers();
}
