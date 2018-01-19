package pl.sda.daty.zadania.zadanie_7;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String STARTING_LIFESPAN = "100";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy mm dd");


        System.out.println("Podaj swoj wiek w formacie yyyy-mm-dd: ");
        String age= scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(age,formatter);
        LocalDate deathDate = LocalDate.parse(STARTING_LIFESPAN);

        System.out.println("Jestes kobieta czy mezczyzna (k/m): ");
        String sex = scanner.nextLine();
        if (sex.equals("k")){
        }
        else{
            System.out.println("Mezyczzni zyja 10 lat krocej");
        }

        System.out.println("Czy palisz papierosy? ");
        String smoker = scanner.nextLine();
        if(smoker.equals("y")) {
            System.out.println("Istnieje prawdopodobienstwo ze umrzesz na zawal w wieku 60lat");
        }else{

        }

    }
}
