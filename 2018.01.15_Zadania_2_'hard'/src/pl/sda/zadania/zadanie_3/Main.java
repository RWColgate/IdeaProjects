package pl.sda.zadania.zadanie_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Journal journal = new Journal();
//
//        journal.addNewStudent("a","A");
//        journal.addNewStudent(new Student("b","B"));
//        journal.addNewStudent(student1);
//
//        journal.printAllStudents();
        /*-----------------------*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikacja dziennika.");
        Journal journal = new Journal();

        boolean isWorking = true;
        do {
            System.out.println("Podaj komende");
            String command = sc.nextLine().trim().toLowerCase();

            String[] words = command.split(" ");

            if (words[0].equals("add")) {
                journal.addNewStudent(words[1], words[2]);
                System.out.println("Uczen dodany.");
            } else if (words[0].equals("remove")) {
                journal.removeStudent(Integer.parseInt(words[1]));
                System.out.println("Uczen usuniety");
            } else if (words[0].equals("print")) {
                journal.printAllStudents();
            } else if (words[0].equals("quit")) {
                break;
            }
        } while (isWorking);
    }
}
