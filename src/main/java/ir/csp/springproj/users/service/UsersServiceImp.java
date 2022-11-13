package ir.csp.springproj.users.service;

import ir.csp.springproj.users.model.Users;
import ir.csp.springproj.users.model.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImp implements UsersService{

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users NewUser(Users u) {
        if(u.getPhone()!=null && u.getId()==null){
            return usersRepository.save(u);
        }
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
