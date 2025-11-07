package JavaOOP;

public class Oop {
    public static void main(String args[]){
        Employee em = new Employee();
        Employee em1 = new Employee("ridhi",2000);
        em.setName("rafi");
        em.setSalary(1000.0);
        em.printDetails();
        System.out.println(em1.toString());
        Circle c = new Circle(3.2);
        System.out.println("Number : "+c.getNumberOfObject());
        Circle c1 = new Circle(5.2);
        System.out.println("Number : "+c.getNumberOfObject());
        Circle c2 = new Circle(c);
        // System.out.println(c.getArea());//getArea() was made private afterward
        c.print();
        System.out.println(c.toString());
    }
}
