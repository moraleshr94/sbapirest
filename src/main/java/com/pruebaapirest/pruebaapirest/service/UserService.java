package com.pruebaapirest.pruebaapirest.service;

import com.pruebaapirest.pruebaapirest.data.User;
import java.util.List;

public interface UserService {
    
    List<User> getAllUsers();

    User getUserById(Long id);
    
    //User saveUser(User user);

    User updateUserAddACLById(Long id, Long idac);
    
    User updateUserDeleteACLById(Long id);
    
    //void deleteUserById(Long id);

}