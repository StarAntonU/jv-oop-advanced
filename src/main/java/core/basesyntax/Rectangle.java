package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", "
                + "Area " + getArea() + " sq. units, "
                + "Length " + length + " units, "
                + "Width " + width + " units, "
                + "Color " + color);
    }
}
