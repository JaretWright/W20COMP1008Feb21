import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle, square;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(5,10);
        square = new Rectangle(5,5);
    }

    @Test
    public void setLength() {
        double expResult = 15;
        rectangle.setLength(15);
        assertEquals(expResult, rectangle.getLength(),0.0);
    }

    @Test
    public void setLengthLow() {
        try {
            rectangle.setLength(-15);
            fail("setLength with negative number should trigger an exception");
        }
        catch (IllegalArgumentException e){
            System.out.println("invalid low length: "+e.getMessage());
        }

    }

    @Test
    public void setWidth() {
        rectangle.setWidth(50);
        double expResult = 50.0;
        assertEquals(expResult, rectangle.getWidth(), 0.0);
    }

    @Test
    public void setWidthLow() {
        try {
            rectangle.setWidth(-50);
            fail("width cannot be negative");
        }catch (IllegalArgumentException e)
        {
            System.out.println("Invalid low width exception: "+e.getMessage());
        }
    }


    @Test
    public void getPerimeter() {
    }

    @Test
    public void getArea() {
    }

    @Test
    public void isSquare() {
    }

    @Test
    public void toStringCustom() {
    }
}