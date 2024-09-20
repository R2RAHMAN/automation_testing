package PL2;

import java.util.List;
import java.util.stream.Collectors;

public class ShapeCalculator {
    public static double calculateArea(Shape shape){
        return switch (shape) {
            case Circle circle -> 2 * Math.PI * circle.radius;
            case Rectrangle rectangle -> rectangle.sideA * rectangle.sideB;
            case Square square -> 4 * square.side;
            case null, default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
    public static List<Shape> filterShapes(List<Shape> shapes, double minArea, double maxArea) {
        return shapes.stream()
                .filter(shape -> {
                    double area = calculateArea(shape);
                    return area >= minArea && area <= maxArea;
                })
                .collect(Collectors.toList());
    }
    public static List<Shape> filterShapes(List <Shape> shapes, String info) {
        return shapes.stream()
                .filter(shape -> shape.getName().contains(info))
                .collect(Collectors.toList());
    }

}
