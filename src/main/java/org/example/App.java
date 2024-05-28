package org.example;

import org.train.maven.Cube;
import org.train.maven.Sphere;
import org.train.maven.geometry.Circle;
import org.train.maven.geometry.Rectangle;
import org.train.maven.geometry.Triangle;

import static org.train.maven.CircleUtil.circleUtils;

public class App 
{
    public static void main( String[] args ) {
        Circle circle = new Circle(5);
        circleUtils();
        circleUtils(circle);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        Cube cube = new Cube(3);
        System.out.println(cube.calculateVolume());
        System.out.println(cube.getSideLength());

        Sphere sphere= new Sphere(7);
        System.out.println(sphere.calculateVolume());
        System.out.println(sphere.getRadius());


    }
}
