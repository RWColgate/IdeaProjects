package pl.sda.zadania.zadanie_6;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.addMoney(500);
        bankAccount.subtractMoney(300);
    }
}