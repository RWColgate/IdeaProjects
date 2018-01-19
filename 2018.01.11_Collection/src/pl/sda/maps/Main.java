package pl.sda.maps;

import javax.swing.text.Style;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(100200, new Student(100200,"Jan", "Kowalski"));
        studentHashMap.put(1, new Student(194,"Adam", "Chylinskio"));
        studentHashMap.put(100400, new Student(100400,"Uchiha", "Madara"));
        studentHashMap.put(3, new Student(12498,"Agata", "Stepien"));
        studentHashMap.put(4, new Student(4930,"Anna", "Kobylo"));

//        System.out.println(studentHashMap);
//        System.out.println(studentHashMap.containsKey(100200));
//        System.out.println(studentHashMap.get(100400));
//        System.out.println(studentHashMap.size());
//        System.out.println(studentHashMap);
//
//        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();
//        studentHashMap.put(100200, new Student(100200,"Jan", "Kowalski"));
//        studentHashMap.put(1, new Student(194,"Adam", "Chylinskio"));
//        studentHashMap.put(100400, new Student(100400,"Uchiha", "Madara"));
//        studentHashMap.put(3, new Student(12498,"Agata", "Stepien"));
//        studentHashMap.put(4, new Student(4930,"Anna", "Kobylo"));

//        HashMap<Long, University> universityHashMap= new HashMap<>();
        University university = new University();
        university.addStudent(100, "Jan","Kowalski");
        university.addStudent(200, "Madara","Uchiha");
        university.addStudent(300, "Naruto","Uzumaki");
        System.out.println(university.containsStudent((long) 100));
        try{System.out.println(university.getStudent(200));}
        catch (NoSuchStudentException e){
            System.err.println(e.getMessage());
        }
        System.out.println(university.studentCount());
        university.printallStudent();

    }
}
