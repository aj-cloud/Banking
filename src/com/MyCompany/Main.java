package com.MyCompany;

public class Main {

    public static void main(String[] args) {

       BankingInfo  Holder = new BankingInfo();
       Holder.accountHolderName = "Ajay Kumar ";
       Holder.setBalance(0);
       Holder.setPhoneNumber("7059758686");

       Holder.openAccount();
       Holder.checkBalance();

       Holder.addMoney( 1000);
       Holder.withDrawMoney( 500);

       Holder.checkBalance();
       Holder.withDrawMoney(2000);

    }
}
