package pl.sda.zadania.zadanie_5;

public class Kwadrat {
    private double sideLength;

    public Kwadrat(double sideLength) {
        this.sideLength = sideLength;
    }

    public double countSize(){
        return sideLength*4;
    }
    public double countVolume(){
        return Math.pow(sideLength,2);
    }
}
