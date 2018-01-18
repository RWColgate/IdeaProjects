package pl.sda.zadania.zadanie_3;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Student> studentList = new ArrayList<>();

    public Journal(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Journal() {
    }

    public void addNewStudent(Student newStudent){
        studentList.add(newStudent);
    }
    public void addNewStudent(String name, String surName){
        studentList.add(new Student(name, surName));
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }
    public void removeStudent(int index){
        studentList.remove(index);
    }
    public void printAllStudents(){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

}
