package org.tanouti.oop.basics.encapsulation;

import java.util.function.BiFunction;

public class Account {

    private float balance;

    public  void deposit(float amount) {
        if (amount > 0) {
            balance +=amount;
        }
    }

    public void withDraw(float amount) {
        BiFunction<Float, Float, Float> canDraw = (x, y) -> x-y;
        if( balance - amount > 0) {
            balance = canDraw.apply(balance, amount);
        }
    }

    public void setBalance(float balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

    public float getBalance() {
        return balance;
    }
}
