package JavaOOP1;

public class Person {
    private String name;
    private int age;
    Person(){

    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Name : "+name+" Age : "+age;
    }
}
