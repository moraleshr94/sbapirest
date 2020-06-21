package com.pruebaapirest.pruebaapirest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.pruebaapirest.pruebaapirest.data.AccountList;
import com.pruebaapirest.pruebaapirest.service.AccountListService;


@RestController
@RequestMapping("/account")
public class AccountListController {
    
    @Autowired
    private AccountListService accountListService;
    
    @GetMapping
    public ResponseEntity<List<AccountList>> getAllAccountLists() {
        List<AccountList> accountListList = accountListService.getAllAccountList();
        return new ResponseEntity<>(accountListList, HttpStatus.OK);
    }
  
    @GetMapping("/{id}")
    public ResponseEntity<AccountList> getAccountListById(
            @PathVariable("id") final Long id) {
        AccountList accountList = accountListService.getAccountListById(id);
        return new ResponseEntity<>(accountList, HttpStatus.OK);
    }
   
}