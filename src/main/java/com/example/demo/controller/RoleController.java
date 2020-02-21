package com.example.demo.controller;

import com.example.demo.pojo.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoleController {

    @RequestMapping("/get")
    public List<Role> getAll(){
        List<Role> list=new ArrayList<>();

        for (int i=0;i<10;i++){
            Role role=new Role();
            role.setId(i);
            role.setName("瓜田李下"+i);

            list.add(role);
        }

        return list;
    }
}