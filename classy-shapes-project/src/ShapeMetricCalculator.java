public class ShapeMetricCalculator {
    // This is a utility class created to store every method related to calculations.
    // "Static" keyword means that each of these methods can be used just in the case they are
    // receiving either a new Rectangle or Circle declared and initialized object as parameter.

    public static double CalculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public static double CalculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }
}
