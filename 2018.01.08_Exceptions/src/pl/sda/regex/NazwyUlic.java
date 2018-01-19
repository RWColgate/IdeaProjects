package pl.sda.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NazwyUlic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj adres");
        String adresUzytkownika = scanner.nextLine();

        Pattern wzorzec = Pattern.compile("ul.[\\s\\D*\\s]*");

        Matcher matcher = wzorzec.matcher(adresUzytkownika);
        if(matcher.find()){
            String ulica = matcher.group();
            System.out.printf("Twoja ulica to %s", ulica.substring(3).trim());
        }

    }
}
