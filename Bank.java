package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Ethniki", 1);
        b1.deposit(100);
        //b1.deposit(50);
        //b1.withdraw(20);
        System.out.println();
        
        List<String> lista = b1.getTransactions();
        for (String minima : lista){
            System.out.println(minima);
            
        }   
        
        BankAccount b2 = new BankAccount("Pireaus", 2);
        b2.deposit(1000);
        b2.setName("Pireaus Tamieftiriou");
        b2 = new BankAccount ("Pireaus tamieftiriou", 2);
        System.out.println("Accounts are " + BankAccount.getAccountsOpened());
        //b2.deposit(300);
        //b2.deposit(400);
        b2.withdraw(100);
        
        BankAccount b3;
        b3 = b2;
        b3 = new BankAccount();
        b3.deposit(100);
        
        List<BankAccount> a = new ArrayList();
        a.add(b1);
        a.add(b2);
        a.add(b3);
        
        Person p1 = new Person("Bary", 60, a);
        Person p2 = new Person("Mary", 23);
        p2.addAccount(b1);
        p2.addAccount(b2);
        for (int i = 0; i<a.size()-1; i++){
            p2.addAccount(a.get(i));
        }
        
        double p1Total = p1.getTotalAmount();
        System.out.println("Bary has " + p1Total + " in his accounts");
        
        PersonBankAccounts pba = new PersonBankAccounts(p1, a);
        
        System.out.println(p1);
        
    }  

    
}