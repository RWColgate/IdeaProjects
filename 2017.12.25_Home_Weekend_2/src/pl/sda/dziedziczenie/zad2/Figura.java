package pl.sda.dziedziczenie.zad2;

public enum Figura {
    DWÓJKA("2"),
    TRÓJKA("3"),
    CZWÓRKA("4"),
    PIĄTKA("5"),
    SZÓSTKA("6"),
    SIÓDEMKA("7"),
    ÓSEMKA("8"),
    DZIEWIĄTKA("9"),
    DZIESIĄTKA("10"),
    WALET("J"),
    DAMA("Q"),
    KRÓL("K"),
    AS("A");

    String symbol;

    Figura(String symbol) {
        this.symbol = symbol;
    }
}
