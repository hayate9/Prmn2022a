package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.registerAccount("髙橋颯", "12345");
        atm.existsAccount("髙橋颯", "12345");
        atm.registerAccount("藤井智子", "56789");
        atm.deposit("12345", 1000);
        atm.deposit("56789", 20000);
        atm.withdraw("12345", 2000);
        atm.withdraw("12345", 500);
        atm.withdraw("56789", 15000);
    }
}
