package JavaOOP1;
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        Person p = new Person("Ash",21);
        Student s = new Student(252,"Ari",21);
        ArrayList<Object> al = new ArrayList<>();
        al.add(p);
        al.add(s);
        for(Object a : al){
            System.err.println(a.toString());
        }
    }
}
