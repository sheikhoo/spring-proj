package ir.csp.springproj.users.service;

import ir.csp.springproj.users.model.UsersModel;

import java.util.List;


public interface UsersService {
    public UsersModel NewUser(UsersModel u);

    public List<UsersModel> getAllUsers();
}
