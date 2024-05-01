/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author babye
 */
public class Account {
    //Instance variables...
    String name;
    int number;
    double balance;
    
    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    //Getters  ---------------------------------------------------------------------------------------
    
    public String getName() {
        return name;
    }
    
     public int getNumber() {
        return number;
    }
     
      public double getBalance() {
        return balance;
    }

    //Setters  ---------------------------------------------------------------------------------------
      
    public void setName(String name) {
         this.name = name;
    }
    
     public void setNumber(int number) {
         this.number = number;
    }
     
      public void setBalance(double balance) {
         this.balance = balance;
    }
      
    //Others  ---------------------------------------------------------------------------------------
    
       public boolean withdraw(double amount) {
         if (this.balance >= amount && amount > 0)
         {
             this.balance -= amount;
             return true;
         }
         else
         {
             return false;
         }
    }
       
       public boolean deposit(double amount) {
         if (amount > 0)
         {
             this.balance += amount;
             return true;
         }
         else
         {
             return false;
         }
    }
    
   
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", "
                + String.format("$%.2f", getBalance()) + ")";
    }

}
