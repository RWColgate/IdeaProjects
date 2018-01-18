package pl.sda.zadania.zadanie_8;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double calucalateDelta(){
        return Math.pow(b,2)-(4*a*c);
    }
    public double calculateX1(){
        double delta = calucalateDelta();
        double x1 = (-b-Math.sqrt(delta))/2*a;
        if(delta>0) return x1;
        else if(delta<0) throw new DeltaLessThanZeroException();
        else if (delta==0) return 0;
        return 0;
    }
    public double calculateX2(){
        double delta = calucalateDelta();
        double x2 = (-b+Math.sqrt(delta))/2*a;
        if(delta>0) return x2;
        else if(delta<0) throw new DeltaLessThanZeroException();
        else if (delta==0) throw new DeltaEqualsZeroException();
        return 0;
    }
}
