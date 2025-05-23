package ex06_design_pattern;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public static class Factory {


    private Factory() {
    }

    public static Factory createFactory() {
        return new Factory();
    }
}
            public class Rectangle implements Shape {
                public static void main(String[] args) {

                }

                @Override
                public java.awt.Rectangle getBounds() {
                    return null;
                }

                @Override
                public Rectangle2D getBounds2D() {
                    return null;
                }

                @Override
                public boolean contains(double x, double y) {
                    return false;
                }

                @Override
                public boolean contains(Point2D p) {
                    return false;
                }

                @Override
                public boolean intersects(double x, double y, double w, double h) {
                    return false;
                }

                @Override
                public boolean intersects(Rectangle2D r) {
                    return false;
                }

                @Override
                public boolean contains(double x, double y, double w, double h) {
                    return false;
                }

                @Override
                public boolean contains(Rectangle2D r) {
                    return false;
                }

                @Override
                public PathIterator getPathIterator(AffineTransform at) {
                    return null;
                }

                @Override
                public PathIterator getPathIterator(AffineTransform at, double flatness) {
                    return null;
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

public void main() {
}




