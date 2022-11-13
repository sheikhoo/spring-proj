package ir.csp.springproj.users.service;

import ir.csp.springproj.users.model.Users;
import ir.csp.springproj.users.model.UsersModel;
import ir.csp.springproj.users.model.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImp implements UsersService{

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UsersModel NewUser(UsersModel u) {
        if(u.getPhone()!=null && u.getId()==null){
            Users user=new Users(u.getFirstName(),u.getLastName(),u.getPhone());
            user = usersRepository.save(user);
            return new UsersModel(user.getId(),user.getFirstName(),user.getLastName(),user.getPhone());
        }
        return null;
    }

    @Override
    public List<UsersModel> getAllUsers() {
        List<UsersModel> usersModels=new ArrayList<>();
        List<Users> users = usersRepository.findAll();

        users.forEach(u->usersModels.add(new UsersModel(u.getId(),u.getFirstName(),u.getLastName(),u.getPhone())));
        return usersModels;
    }
}
