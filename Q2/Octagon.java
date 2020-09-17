import java.lang.*;

public class Octagon implements Shape{
    private double side;

    public Octagon(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return (side * side) * (2 + 2 * (Math.sqrt(2)));
    }

    public double getPerimeter(){
        return 8 * side;
    }

    public String toString(){
        return "An octagon whose side is " + side + " will have an area and perimeter of " + getArea() + " and " + getPerimeter() + " respectively ";
    }

    public static void main(String[] args){
        Octagon octagon = new Octagon(12);
        System.out.print(octagon);
    }
}