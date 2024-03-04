package view;

import controller.AccountController;
import model.Account;

import java.util.List;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        while(true){
            System.out.println("[Account] 0-Exit 1-Create 2-Deposit " +
                    "3-Withdraw 4-Balance 5-Remove 6-Account List");
            switch (sc.next()){
                case "0": return;
                case "1":
                    System.out.println("Create Account");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println("Deposit");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println("Withdraw");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("Balance");
                    System.out.println(accountController.getBalance(sc));
                    break;
                case "5":
                    System.out.println("Cancel Account");
                    System.out.println(accountController.cancelAccount(sc));
                    break;
                case "6":
                    System.out.println("Account List");
                    accountController.getAccounts().forEach((i)-> {
                        System.out.println(i);
                    });
                    break;
            }
        }


    }
}