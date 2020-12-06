package org.tanouti.oop.basics.encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        // should not allow to be modified from outside to control the rules of our cl
        // account.balance = -1;
        account.deposit(10);
        account.withDraw(5);
        System.out.println(account.getBalance());
    }
}
