package pl.sda.maps;

import javax.rmi.CORBA.StubDelegate;
import java.util.HashMap;
import java.util.Random;

public class University {
    private HashMap<Long, Student> database = new HashMap<>();

    void addStudent(long indexNumber, String name, String surname){
        Student newStudent = new Student(indexNumber, name, surname);
        database.put(indexNumber, newStudent);
    }
    boolean containsStudent(Long indexNumber){
        return database.containsKey(indexNumber);
    }
    Student getStudent(long indexNumber){
        if(database.containsValue(indexNumber)){
            return database.get(indexNumber);
        }else{
            throw new NoSuchStudentException();
        }
    }
    int studentCount(){
        return database.size();
    }
    void printallStudent(){
        System.out.println(database);
    }
}
