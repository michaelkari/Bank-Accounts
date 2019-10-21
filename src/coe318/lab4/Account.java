/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Michael
 */
public class Account {
    //instance vars
    int num;
    double bal;
    double amount;
    String name;
    
    public Account (String name1, int number, double balance){
        num=number;
        bal=balance;
        name=name1;
    }
    //GETTERS
    public String getName(){
        return name;
    }
    public int getNumber(){
        return num;
    }
    public double getBalance(){
        return bal;
    }
    //SETTERS
    public void setName(String name){
        this.name=name;
    }
    
    public void setNumber(int num){
        this.num=num;
    }
    
    public void setBalance(double bal){
        this.bal=bal;
    }
    //DEPOSIT
    public boolean deposit (double amt){
        boolean test=true;
        amount=amt;
        if (amount>0){
            bal=bal+amount;
        }
        else{
            test=false;
        }
        return test;
    }
    //WITHDRAW
    public boolean withdraw(double amt){
        boolean test=true;
        amount=amt;
        if(amount>0 && amount<=bal){
            bal=bal-amt;
        }
        else{
            test=false;
        }
        return test;
    }
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + "," + getNumber() + "," + String.format("$%.2f", getBalance()) + ")";
    }
    
}
