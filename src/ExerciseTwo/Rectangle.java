package ExerciseTwo;

public class Rectangle {
    private double sideOne;
    private double sideTwo;
    private ShapeCalculator calculator;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        calculator = new ShapeCalculator();
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double calculateArea() {
        return calculator.rectangleArea(this);
    }

    public double calculatePermiter() {
        return calculator.rectanglePermiter(this);
    }
}
