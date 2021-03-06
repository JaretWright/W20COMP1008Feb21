public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public String getColour()
    {
        return "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be greater than 0");
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public String toString()
    {
        return String.format("Circle with radius %.1f", radius);
    }
}
