package com.pruebaapirest.pruebaapirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.pruebaapirest.pruebaapirest.data.User;
import com.pruebaapirest.pruebaapirest.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService {

    private static final Long NULL = null;
	@Autowired
    private UserRepo userRepository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(final Long id) {
        return userRepository.findById(id).get();
    }

    /*
    @Override
    public User saveUser(final User user) {
        return userRepository.save(user);
    }
    */

    @Override
    public User updateUserAddACLById(Long id, Long idacc)
    {
            User userFromDb = userRepository.findById(id).get();
            //userFromDb.setName(userToUpdate.getName());
            userFromDb.setAccountList(idacc);
            return userRepository.save(userFromDb);
        
    }

    @Override
    public User updateUserDeleteACLById(Long id)
    {
        User userFromDb = userRepository.findById(id).get();
        userFromDb.setAccountList(NULL);
        return userRepository.save(userFromDb);
        
    }

    /*
    @Override
    public void deleteUserById(final Long id) {
        userRepository.deleteById(id);
    }    
    */
    
}