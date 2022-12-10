package com.example.sample.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping
    public List<Account> getAccounts() {
        return List.of(new Account("test", "customer"));
    }
}
