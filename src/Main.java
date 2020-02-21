import org.w3c.dom.css.Rect;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5,10);
        Rectangle square = new Rectangle(4,4);
        Circle circle = new Circle(7);

        ArrayList<TwoDimensionalShape> favShapes = new ArrayList<>();
        favShapes.add(rectangle);
        favShapes.add(square);
        favShapes.add(circle);

        //loop over the Objects and display the toString method
        for (TwoDimensionalShape shape:favShapes)
            System.out.printf("%s has area %.2f%n",shape.toString(), shape.getArea());


    }

}
