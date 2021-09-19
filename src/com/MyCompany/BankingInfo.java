package com.MyCompany;


public class BankingInfo {
   public String accountHolderName;
    private int balance;
    private String emailId;
    private String phoneNumber;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void openAccount(){
        System.out.println("Account opened for"  + accountHolderName);
    }
    public void checkBalance(){
        System.out.println("your balance is"  + balance);
    }
    public void addMoney(int amount){
        if (amount>0){
        balance = balance + amount;
        System.out.println(amount +  "rupees added to account, Newly updated balance is "  +  balance);
    } else {
            System.out.println("updated balance is"   +  balance);
        }

    }
    public void withDrawMoney(int amount){
        if(balance>amount){
            balance = balance-amount;
            System.out.println(amount + "rupees withdrawn" + "newly updated balance is "+ balance);
        }
        else{
            System.out.println("Insufficient funds");
        }

    }



}

