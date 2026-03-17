/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        if (balanceAtStart > 0.0) balance = balanceAtStart;
        else balance = 0.0;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.5) balance -= 2.5;
    }

    public void payGourmet() {
        if (balance >= 4.0) balance -= 4.0;
    }

    public void loadMoney(double amount) {
        if (amount < 0.0) return;
        balance += amount;
        if (balance > 150.0) balance = 150.0;
    }    
}
