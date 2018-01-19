package pl.sda.wyjatki.bank;

public class Konto {

    private String imie;
    private int stanKonta;

    public Konto(String imie, int stanKonta) {
        this.imie = imie;
        this.stanKonta = stanKonta;
    }

    public int wybierzPieniadze(int kwota) {
//        System.out.println("Stan konta na ta chwile: " + this.stanKonta);
        if (kwota <= stanKonta) {
            this.stanKonta -= kwota;
            return kwota;
        }
            throw new InsufficientFundsException();

//        System.out.println("Nowy stan konta = " + this.stanKonta);
    }

    public int pobierzStanKonta() {
        return this.stanKonta;
    }
}
