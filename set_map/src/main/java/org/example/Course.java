package org.example;

import java.util.Objects;

public class Course {
    private String name;
    private String instructor;
    private String room;

    public Course(String name, String instructor, String room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(instructor, course.instructor) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instructor, room);
    }


}
