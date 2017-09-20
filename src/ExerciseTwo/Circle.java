package ExerciseTwo;

public class Circle {
    private double diameter;
    private ShapeCalculator calculator;

    public Circle(double diameter) {
        this.diameter = diameter;
        calculator = new ShapeCalculator();
    }

    public double getDiameter() {
        return diameter;
    }

    public double calculateArea() {
        return calculator.circleArea(this);
    }

    public double calculatePermiter() {
        return calculator.circlePermiter(this);
    }
}
