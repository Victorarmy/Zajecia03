package ExerciseTwo;

public class Square {
    private double side;
    private ShapeCalculator calculator;

    public Square(double side) {
        this.side = side;
        calculator = new ShapeCalculator();
    }

    public double getSide() {
        return side;
    }

    public double calculateArea() {
        return calculator.squareArea(this);
    }

    public double calculatePermiter() {
        return calculator.squarePermiter(this);
    }
}
