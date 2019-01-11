package com.hemonth.soapexample.service;

import com.hemonth.soapexample.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String,User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1111);
        peter.setSalary(12000);
        User john = new User();
        john.setName("Peter");
        john.setEmpId(1111);
        john.setSalary(12000);
        User ram = new User();
        ram.setName("Peter");
        ram.setEmpId(1111);
        ram.setSalary(12000);

        users.put(peter.getName(),peter);
        users.put(john.getName(),john);
        users.put(ram.getName(),ram);

    }

    public User gerUser(String userName){
        return users.get(userName);
    }
}
