package com.pcschool.ocp.d10_ListAndSet.case4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
    private String name;
    private Set<Exam> exams;

    public Student(String name) {
        this(name, new LinkedHashSet());
    }

    public Student(String name, Set<Exam> exams) {
        this.name = name;
        this.exams = exams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public Student addScore(int score) {
        Exam exam = new Exam(score);
        exams.add(exam);
        return this;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", exams=" + exams + '}';
    }

    @Override
    public int compareTo(Student other) {
        double avg       =  this.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        double avg_other = other.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        return (int)(avg_other - avg);
    }
    
    
}
