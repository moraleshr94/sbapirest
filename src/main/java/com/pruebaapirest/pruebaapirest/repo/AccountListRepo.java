package com.pruebaapirest.pruebaapirest.repo;
    
import org.springframework.data.repository.CrudRepository;
import com.pruebaapirest.pruebaapirest.data.AccountList;

public interface AccountListRepo extends CrudRepository<AccountList, Long> {

}