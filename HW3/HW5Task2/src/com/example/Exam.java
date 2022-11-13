package com.example;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private int maxValue;
    private List<Student> students = new ArrayList<Student>();

    // Composition relationship with Question: Exam has Questions
    private final List<Question> questions = new ArrayList<Question>();

    public Exam(){

    }

    public boolean register(Student pStudent){
        for(Student s : students){
            if (students.contains(s)){
                return true;
            }
        }
        return false;
    }

    public void addQuestion(int id, String task, int value){
        questions.add(new Question(id,task,value));
    }


    public void addStudent(Student pStudent){
        this.students.add(pStudent);
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

}
