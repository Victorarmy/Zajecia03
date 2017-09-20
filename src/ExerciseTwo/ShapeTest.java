package ExerciseTwo;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator calculator= new ShapeCalculator();

        Square square = new Square(5);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Square", calculator.squareArea(square), calculator.squarePermiter(square));
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Circle", calculator.circleArea(circle), calculator.circlePermiter(circle));
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Rectangle", calculator.rectangleArea(rectangle), calculator.rectanglePermiter(
                rectangle));
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Triagnle", calculator.triangleArea(triangle), calculator.trianglePermiter(triangle));
        System.out.println();
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Square", square.calculateArea(), square.calculatePermiter());
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Circle", circle.calculateArea(), circle.calculatePermiter());
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Rectangle", rectangle.calculateArea(), rectangle.calculatePermiter());
        System.out.printf("%s area: %.2f, permiter: %.2f\n", "Triangle", triangle.calculateArea(), triangle.calculatePermiter());

    }
}
