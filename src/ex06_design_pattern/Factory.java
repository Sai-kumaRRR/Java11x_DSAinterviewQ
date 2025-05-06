package ex06_design_pattern;

import java.awt.*;


            public class Rectangle implements Shape {
                public static void main(String[] args) {

                }
            }

                public void draw() {
                    System.out.println("Drawing Rectangle");
                }


                public class ShapeFactory {
                    public Shape getShape(String shapeType) {
                        if (shapeType == null) {
                            return null;

                        }
                        if (shapeType.equalsIgnoreCase("Circle")) {
                            return new Circle();

                        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                            return new Rectangle();

                        }
                        return null;
                    }
                }




