import java.util.*;

public class ShapeUtility{

    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList){
        if (shapeList == null || shapeList.size() == 0){
            return null;
        } else{
            Octagon placeHolder = new Octagon(0);
            for (int i = 0; i < shapeList.size(); i ++){
                if ((shapeList.get(i) instanceof Octagon) && shapeList.get(i).getArea() > placeHolder.getArea()){
                    Octagon e = (Octagon)shapeList.get(i);
                    placeHolder = e;
                }
            }
            return placeHolder;
        }
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList){
        ArrayList<Shape> placeHolder = new ArrayList<Shape>();
        if (shapeList == null){
            return null;
        } else{
            for (int i = 0; i < shapeList.size(); i ++){
                if (!(shapeList.get(i) instanceof Rectangle)){
                    placeHolder.add(shapeList.get(i));
                }
            }
            if (placeHolder.size() == 0){
                return null;
            }
            return placeHolder;
        }
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea){
        ArrayList<Square> placeHolder = new ArrayList<Square>();
        if (shapeList == null){
            return placeHolder;
        } else{
            for (int i = 0; i < shapeList.size(); i ++){
                if (shapeList.get(i) instanceof Square){
                    Square e = (Square)shapeList.get(i);
                    if (e.getArea() >= minArea){
                        placeHolder.add(e);
                    }
                }
            }
            return placeHolder;
        }   
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length){
        ArrayList<Shape> placeHolder = new ArrayList<Shape>();
        if (shapeList == null){
            return placeHolder;
        } else{
            for (int i = 0; i < shapeList.size(); i ++){
                if (shapeList.get(i) instanceof Rectangle){
                    Rectangle e = (Rectangle)shapeList.get(i);
                    if (e.getLength() >= length){
                        placeHolder.add(e);
                    }
                }
            }
            return placeHolder;
        }   
    }
}