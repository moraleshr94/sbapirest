package com.pruebaapirest.pruebaapirest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import com.pruebaapirest.pruebaapirest.data.User;
import com.pruebaapirest.pruebaapirest.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(
            @PathVariable("id") final Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{id}/{idacc}")
    public ResponseEntity<User> updateUserAddACLById(
            @PathVariable("id") final Long id,
            @PathVariable("idacc") final Long idacc) {
                User updatedUser
                = userService.updateUserAddACLById(id, idacc);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    
    @PutMapping("/delete/{id}")
    public ResponseEntity<User> updateUserDeleteACLById(
            @PathVariable("id") final Long id) {
                User updatedUser
                = userService.updateUserDeleteACLById(id);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    /*
    //Metodos no solictados
    @PostMapping()
    public ResponseEntity<User> saveUser(
            @RequestBody final  User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(
            @PathVariable("id") final Long id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    */
}
