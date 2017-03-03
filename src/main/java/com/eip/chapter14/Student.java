package com.eip.chapter14;

import java.util.*;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class Student implements Comparable<Student>{
    public String name;
    public double gradePointAverage;

    public Student(String name, double gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    public int compareTo(Student that){
        return name.compareTo(that.name);
    }

    public static void sortByGPA(List<Student> studentList){
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.gradePointAverage, o2.gradePointAverage);
            }
        });
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }

    public static void main(String[] argv){
        Student jiya = new Student("Jiya",4.0);
        Student navya = new Student("Navya",4.1);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(jiya);
        studentList.add(navya);
        studentList.add(new Student("Sunil",3.5));
        studentList.add(new Student("Leena",3.7));

      //  System.out.println(studentList);
       // sortByGPA(studentList);
       // Collections.sort(studentList);

        Student[] s1= new Student[4];
        s1[0] = new Student("Jiya",4.0);
        s1[1] = new Student("Navya",4.1);
        s1[2] = new Student("Leena",3.9);
        s1[3] = new Student("Sunil",3.5);

        System.out.println(Arrays.toString(s1));
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1));

    }
}
