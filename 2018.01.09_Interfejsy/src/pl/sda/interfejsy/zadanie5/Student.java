package pl.sda.interfejsy.zadanie5;

import java.util.Arrays;

public class Student implements Comparable {
    private String imie;
    private String nazwisko;
    private int numerAlbumu;

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    @Override
    public String toString() {
        return "imie='" + imie + '\'' + ", nazwisko='" + nazwisko + '\'' + ", numerAlbumu=" + numerAlbumu;
    }

    public static void main(String[] args) {
        Student malgorzata = new Student("Malgorzata", "Kowalska", 3);
        Student tomek = new Student("Tomasz", "Chylisnki", 3094);
        Student ania = new Student("Ania", "Zarzycka", 55);

        Student[] students = new Student[]{malgorzata, ania, tomek};

        Arrays.sort(students);
        wyswietlTablice(students);

    }

    private static void wyswietlTablice(Student[] students) {
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].toString());
        }
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
        return (int) (this.numerAlbumu - that.numerAlbumu);
    }
}
