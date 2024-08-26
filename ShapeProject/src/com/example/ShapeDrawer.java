package com.example;

public class ShapeDrawer {
    public void drawShape(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        drawer.drawShape(circle);    // Output: Drawing a circle.
        drawer.drawShape(rectangle); // Output: Drawing a rectangle.
    }
}