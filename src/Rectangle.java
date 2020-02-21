public class Rectangle extends TwoDimensionalShape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String getColour()
    {
        return "Yellow";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length>0)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    public double getPerimeter()
    {
        return 2*(length+width);
    }

    public double getArea()
    {
        return length*width;
    }

    public boolean isSquare()
    {
        return length==width;
    }

    public String toString()
    {
        return String.format("%s %.1fx%.1f", isSquare()?"Square":"Rectangle",
                                            length, width);
    }
}
