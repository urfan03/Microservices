package com.urfan.accounts.service;

import com.urfan.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
