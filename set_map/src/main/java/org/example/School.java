package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<String,Student>students;

    public School(){
        students = new HashMap<>();
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
    }
    public void printStudents(){
        for(Student student:students.values()){
            System.out.println(student);
        }
    }


    public Student findById(String id){
        for(Student student:students.values()){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public void removeById(String id){
        for(Student student:students.values()){
            if(student.getId().equals(id)){
                students.remove(student.getId());

            }
        }
    }

    public List<Course> getCoursesById(String id){
        Student student = findById(id);
        return student.getCourses();
    }
}
