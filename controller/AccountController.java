package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()

        );
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance(Scanner sc) {
        return accountService.getBalance(sc.next());
    }

    public String cancelAccount(Scanner sc) {
        return accountService.cancelAccount(sc.next());
    }

    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }
}