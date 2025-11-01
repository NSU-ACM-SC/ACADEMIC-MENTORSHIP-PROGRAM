package JavaOOP;
import java.util.Date;
public class Circle {
    private double radius;
    private static int numberOfObject=0;
    public static final double pi = 3.1416;
    Date dateCreated;
    Circle(){
        this.radius=0.0;
        numberOfObject++;
        dateCreated= new Date();
    }
    Circle(double radius){
        this.radius=radius;
        numberOfObject++;
        dateCreated= new Date();
    }
    Circle(Circle c){
        this.radius=c.radius;
        numberOfObject++;
        dateCreated= new Date();
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    private double getArea(){
        return pi*radius*radius;
    }
    static int getNumberOfObject(){
        return numberOfObject;
    }
    void print(){
        System.err.println("Radius : "+radius+" Area : "+getArea());
    }
    @Override
    public String toString(){
        return "Radius : "+radius+" Area : "+getArea()+"Number of ObjectCreated : "
             + getNumberOfObject()+ "Date created" + dateCreated;
    }
}
