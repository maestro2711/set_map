package org.example;

public record StudentRecord(String id,
                            String firstname,
                            String lastname,
                            int age) {  // diese werten sind automatisch private final.


    //Wither: das ist andere methode wie Setter
    public StudentRecord withFirstname(String newName){
        return new StudentRecord(id,newName,lastname,age);
    }



}
