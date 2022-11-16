package lecture04;

public class Account {

    private String name;
    private String number;
    private long balance;

    Account(String name, String number){
        this.balance = 0;
        this.name = name;
        this.number = number;
    }

    String getName(){
        return this.name;
    }

    String getNumber(){
        return this.number;
    }

    long getBalance(){
        return this.balance;
    }

    void setName(String name){
        this.name = name;
    }

    void setNumber(String number){
        this.number = number;
    }

    void setBalance(long balance){
        this.balance = balance;
    }
}
