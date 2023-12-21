package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getSimpleName() + "\n"
                + "Color " + color + "\n"
                + "Area " + getArea() + "\n"
                + "First Leg " + firstLeg
                + "Second Leg " + secondLeg);
    }
}