package serviceImpl;

import model.Account;
import model.User;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<Account> accounts;
    Map<String, User> users;
    private AccountServiceImpl(){
        this.accounts = new ArrayList<>();
    }
    public static AccountService getInstance(){return instance;}


    @Override
    public String createAccount(Account account) {
        return null;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }
}