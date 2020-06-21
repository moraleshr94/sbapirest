package com.pruebaapirest.pruebaapirest.service;
import com.pruebaapirest.pruebaapirest.data.AccountList;
import java.util.List;

public interface AccountListService {
    
    List<AccountList> getAllAccountList();

    AccountList getAccountListById(Long id);
    
    //AccountList saveAccountList(AccountList accountList);
    
   // void deleteAccountListById(Long id);
    
}