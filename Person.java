package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private int age;
    private List<BankAccount> accounts;
    
    //Constructors
    public Person(){
        
    }
    
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }
    
    //getters-setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BankAccount> getAccount() {
        return accounts;
    }

    public void setAccount(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    public void addAccount(BankAccount logariasmo){
        if(accounts==null){
            accounts = new ArrayList();
        }
        this.accounts.add(logariasmo);
    }
    
        public double getTotalAmount(){
        double sum = 0.0;
        for (BankAccount ac : this.getAccount()){
            sum += ac.getAmount();
        }
        return sum;
        
    }
        
        public double getAmountByAccount(String trapeza){
            double sum = 0.0;
            for(BankAccount ac:accounts){
                if (ac.getName().equals(trapeza)){
                    sum += ac.getAmount();
            }
        }
            return sum;
        }
        
        public String toString(){
            String details = "Person( " + "name: " + this.name+", age: "+this.age+")";
            return details;
        }
    
}
