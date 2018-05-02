package com.devinim.template.controller;

import com.devinim.template.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return userDTO;
    }

    @GetMapping
    public Page<UserDTO> getUsers(Pageable pageable){
        List<UserDTO> users = new ArrayList<>();
        users.add(new UserDTO("alicani", "alican@hotmail.com", "Alican", "Tertemiz"));
        users.add(new UserDTO("mahmut", "mamut@gmail.com", "Mahmut", "Can"));
        users.add(new UserDTO("ali", "maalimut@gmail.com", "Ali", "Cin"));
        users.add(new UserDTO("ahmet", "ate@gmail.com", "Ahmet", "Ata"));
        users.add(new UserDTO("cengiz", "cengo12@gmail.com", "Cengiz", "Cihan"));
        users.add(new UserDTO("omer", "ommu@gmail.com", "Ömer", "Deri"));
        users.add(new UserDTO("muammer", "mumo@gmail.com", "Muammer", "Osmanoğlu"));
        return new PageImpl<UserDTO>(users, pageable, users.size());
    }

    @GetMapping(path = "/{id}")
    public UserDTO getUser(@PathVariable Long id){
        return new UserDTO("alicani", "alican@hotmail.com", "Alican", "Tertemiz");
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable Long id){
        return String.format("User id: %s deleted", id);
    }

}
