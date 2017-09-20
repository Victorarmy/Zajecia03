package ExerciseTwo;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private ShapeCalculator calculator;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        calculator = new ShapeCalculator();
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }


    public double calculateArea() {
        return calculator.triangleArea(this);
    }

    public double calculatePermiter() {
        return calculator.trianglePermiter(this);
    }
}
