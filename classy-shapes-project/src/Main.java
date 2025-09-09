public class Main {
    public static void main(String[] args) {
        // When creating an instance/object of a certain class, the labeled name will be
        // the reference variable.
        Rectangle rectangle = new Rectangle(5.0,3.0);
        Circle circle = new Circle(2.5);

        // Now, let's call ShapeMetricCalculator methods.
        // Static methods have a specialty associated with them, they do not require
        // an object of the class to call them. They can be called using the dot operator
        // with the name of the class that defines them. So, you need not create the object
        // of ShapeMetricCalculator.
        double rectangle_area = ShapeMetricCalculator.CalculateRectangleArea(rectangle);
        double circle_area = ShapeMetricCalculator.CalculateCircleArea(circle);

        // Displaying areas.
        System.out.println("Rectangle area: " + rectangle_area);
        System.out.println(String.format("Circle area: %.2f", circle_area));
    }
}