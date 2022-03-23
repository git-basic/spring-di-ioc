package edu.sabanciuniv.iocdiexample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {

    List<User> findAllUsers(){
        List<User> users = new ArrayList<>();
        User user = new User(1,"Ahmet");

        users.add(user);
        return users;
    };

}
