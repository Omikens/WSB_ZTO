package com.company;

public class Human extends Animal{

    public String firstName;
    public String lastName;

    private double salary;

    Human(String firstName, String lastName) {
        super("homo sapiens", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary(){
        System.out.println("Pobrano informacje o Twojej wypłatcie " + salary);
        return salary;
    }

    public void setSalary(double salary){
        if (salary >= 0){
            this.salary = salary;
            System.out.println("Wysłano nowe dane dotyczacy wypłaty");
        }
        else {System.out.println("mniej niz zero");}
    }
}
