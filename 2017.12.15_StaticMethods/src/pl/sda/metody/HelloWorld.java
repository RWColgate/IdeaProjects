package pl.sda.metody;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        helloWorld();

        String imie = "Rafal";
        String[] imiona = new String[]{imie, "Tomek", "Agnieszka", "Robert"};
       for(String i:imiona){
           przedstawSie(i);
       }

    }


    private static void przedstawSie(String imie) {
        System.out.println("Czesc mam na imie "+ imie);
    }

    private static void helloWorld(){
        System.out.println("Hello World");
    }
}
