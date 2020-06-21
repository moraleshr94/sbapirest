package com.pruebaapirest.pruebaapirest.data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class AccountList {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(name = "accountid",required = true, value = "123", notes = "account id unique code")
    private Long accountid;
    @ApiModelProperty(name = "accountname", required = true, value = "accountname", notes = "account name")
    private String accountname;
    @ApiModelProperty(name = "accountcurrency", required = true, value = "MXN", notes = "account currency")
    private String accountcurrency;

    protected AccountList() {}
    
    public AccountList(Long accountid, String accountname, String accountcurrency) {
        this.accountid = accountid;
        this.accountname = accountname;
        this.accountcurrency = accountcurrency;
    }
    
    public Long getAccountId() {
        return accountid;
    }

    public void setAccountId(Long accountid) {
        this.accountid = accountid;
    }

    public String getAccountName() {
        return accountname;
    }

    public void setAccountName(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountCurrency() {
        return accountcurrency;
    }

    public void setAccountCurrency(String accountcurrency) {
        this.accountcurrency = accountcurrency;
    }
    
}