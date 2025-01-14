package core.basesyntax;

public abstract class Figure implements CalculatorArea {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();
}
