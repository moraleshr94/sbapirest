package com.pruebaapirest.pruebaapirest.repo;

import org.springframework.data.repository.CrudRepository;
import com.pruebaapirest.pruebaapirest.data.User;

public interface UserRepo extends CrudRepository<User, Long> {

}