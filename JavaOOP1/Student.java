package JavaOOP1;

public class Student extends Person {
    private int id;
    Student(){

    }
    Student(int id,String name,int age){
        super(name,age);
        this.id=id;
    }
    @Override
    public String toString(){
        return super.toString()+" ID : "+id;
    }

    // @Override
    // public String toString(){
    //     return "Id : "+id+" Name : "+super.getName()+" Age : "
    //     +super.getAge();
    // }
}
