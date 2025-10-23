package JavaOOP;

public class Circle {
    private double radius;
    private static int numberOfObject=0;
    public static final double pi = 3.1416;
    Circle(){
        this.radius=0.0;
        numberOfObject++;
    }
    Circle(double radius){
        this.radius=radius;
        numberOfObject++;
    }
    Circle(Circle c){
        this.radius=c.radius;
        numberOfObject++;
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
        return "Radius : "+radius+" Area : "+getArea();
    }
}
