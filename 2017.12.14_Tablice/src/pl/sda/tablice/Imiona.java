package pl.sda.tablice;

public class Imiona {
    public static void main(String[] args) {
        String [] imiona = new String []{"Anna", "Beata", "Cezary"};
        for ( int i=0; i<imiona.length; i++){
            System.out.println(imiona[i]);
        }
        imiona[0] = "Piotr";
        for(int i=imiona.length-1; i>=0; i--){
            System.out.println(imiona[i]);
        }
    }
}
