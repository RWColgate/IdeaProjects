package pl.sda.zadania.zadanie_4;

import com.sun.org.apache.xpath.internal.operations.Div;

public class Kalkulator {


    public double addTwoNumbers(double digit1, double digit2){
        return digit1+digit2;
    }
    public double subtractTwoNumbers(double digit1, double digit2){
        return digit1-digit2;
    }
    public double multiplyTwoNumbers(double digit1, double digit2){
        return digit1*digit2;
    }
    public double divideTwoNumbers(double digit1, double digit2)throws DivisionByZeroException{
//        if(digit2==0){
//            throw new DivisionByZeroException();
//        }
        return digit1/digit2;
    }

}
