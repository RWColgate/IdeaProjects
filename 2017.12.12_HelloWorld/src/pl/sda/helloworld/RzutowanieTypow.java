package pl.sda.helloworld;

public class RzutowanieTypow {
    public static void main(String[] args) {
        char znak;
        for ( int i=0 ; i<256;){
            ++i;
            znak = (char)i;
            System.out.println(i+" to "+znak+"");


        }
    }
}
