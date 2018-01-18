package pl.sda.zadania.zadanie_6;

public class BankAccount {
    private double stankonta = 0;

    public BankAccount(double stankonta) {
        this.stankonta = stankonta;
    }

    public void addMoney(double howMuchToAdd){
        stankonta+=howMuchToAdd;
    }
    public void subtractMoney(double howMuchToTake){
        stankonta-=howMuchToTake;
    }
    public void printBankAccountStatus(){
        System.out.println(this.stankonta);
    }
}
