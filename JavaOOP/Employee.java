package JavaOOP;

public class Employee {
    private String name;
    private double salary;
    Employee(){
        name=null;
        salary=0;
    }
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    // Employee(String n, double s){
    //     name=n;
    //     salary=s;
    // }
    Employee(Employee e){
        this.name=e.getName();
        this.salary=e.getSalary();
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name =name;
    }
    double getSalary(){
        return this.salary;
    }
    void setSalary(double salary){
        this.salary =salary;
    }
    void printDetails(){
        System.out.println("Name : "+name+" Salary : "+salary);
    }
    @Override
    public String toString(){
        return "Name : "+name+" Salary : "+salary;
    }

}