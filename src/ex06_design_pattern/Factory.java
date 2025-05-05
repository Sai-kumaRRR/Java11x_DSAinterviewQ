package ex06_design_pattern;

import java.awt.*;

public class Factory {
    void draw();

}

public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");


        public class Rectangle implements Shape {

            public void draw() {
                System.out.println("Drawing Rectangle");
            }

        }
        public class ShapeFactory {
            public Shape getShape(String shapeType) {
                if (shapeType == null) {
                    return null;

                }
                if (shapeType.equalsIgnoreCase("Circle")) {
                    return new Circle;

                } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                    return new Rectangle();

                }
                return null;
            }
        }


    }