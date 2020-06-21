package com.pruebaapirest.pruebaapirest.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(name = "id",required = true, value = "123", notes = "user unique code")
    private Long userid;
    @ApiModelProperty(name = "name", required = true, value = "Laura", notes = "name of the user")
    private String name;
    @ApiModelProperty(name = "accountList", required = true, value = "123", notes = "account list unique code")
    private Long accountlist;

    protected User() {}
    
    public User(Long userid, String name, Long accountlist) {
        this.userid = userid;
        this.name = name;
        this.accountlist = accountlist;
    }
    
    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountList() {
        return accountlist;
    }

    public void setAccountList(Long accountlist) {
        this.accountlist = accountlist;
    }
    
}