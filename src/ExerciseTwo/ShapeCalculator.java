package ExerciseTwo;

import org.w3c.dom.css.Rect;

public class ShapeCalculator {

    double squareArea(Square square) {
        return square.getSide() * square.getSide();
    }

    double squarePermiter(Square square) {
        return square.getSide() * 4;
    }

    double circleArea(Circle circle) {
        return Math.pow(circle.getDiameter()/2, 2) * Math.PI;
    }

    double circlePermiter(Circle circle) {
        return 2 * Math.PI * circle.getDiameter()/2;
    }

    double triangleArea(Triangle triangle) {
        double p = (triangle.getSideOne() + triangle.getSideTwo() + triangle.getSideThree()) / 2;
        return Math.sqrt(p * (p - triangle.getSideOne())*(p - triangle.getSideTwo())*(p - triangle.getSideThree()));
    }

    double trianglePermiter(Triangle triangle) {
        return triangle.getSideOne() + triangle.getSideThree() + triangle.getSideTwo();
    }

    double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideOne() * rectangle.getSideTwo();
    }

    double rectanglePermiter(Rectangle rectangle) {
        return 2 * rectangle.getSideTwo() + 2* rectangle.getSideOne();
    }
}
