package com.pruebaapirest.pruebaapirest.service;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.List;
    
    import com.pruebaapirest.pruebaapirest.data.AccountList;
    import com.pruebaapirest.pruebaapirest.repo.AccountListRepo;  
    
    @Service
    public class AccountListServiceImpl implements AccountListService {
    
        @Autowired
        private AccountListRepo accountListRepository;
    
        @Override
        public List<AccountList> getAllAccountList() {
            return (List<AccountList>) accountListRepository.findAll();
        }
    
        @Override
        public AccountList getAccountListById(final Long id) {
            return accountListRepository.findById(id).get();
        }
        /*
        //metodos no solicitados
        @Override
        public AccountList saveAccountList(final AccountList accountList) {
            return accountListRepository.save(accountList);
        }
    
        @Override
        public void deleteAccountListById(final Long id) {
            accountListRepository.deleteById(id);
        }
        */

    }