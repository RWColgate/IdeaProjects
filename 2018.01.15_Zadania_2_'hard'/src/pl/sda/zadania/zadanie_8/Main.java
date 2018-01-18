package pl.sda.zadania.zadanie_8;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-5,22);
        System.out.println("Delta wynosi" + quadraticEquation.calucalateDelta());
        System.out.println("X1 wynosi: " + quadraticEquation.calculateX1());
        System.out.println("X1 wynosi: " + quadraticEquation.calculateX2());
    }
}
