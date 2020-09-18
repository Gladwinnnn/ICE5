import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape>{

    public int compare(Shape o1, Shape o2){
        double o1Area = o1.getArea();
        double o2Area = o2.getArea();

        if (o1Area < o2Area){
            return -1;
        } else if (o1 == o2){
            return 0;
        } else{
            return 1;
        }
    }
}