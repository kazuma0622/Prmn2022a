package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "Fighter1";
        String number = "12345";

        atm.exitsAccount(name,number);
        atm.registerAccount(name,number);
        atm.exitsAccount(name,number);
        atm.deposit(number,1000);
        atm.deposit(number,1000);
        atm.withdraw(number,2000);
        atm.withdraw(number,100);
}}
