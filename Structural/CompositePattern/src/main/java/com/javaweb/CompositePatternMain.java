package com.javaweb;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of pattern "Composite"
 *
 * @author Andrii Chernysh
 */
public class CompositePatternMain {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite2.addComponent(square1);
        composite2.addComponent(square2);
        composite2.addComponent(triangle1);

        composite3.addComponent(square3);
        composite3.addComponent(circle1);
        composite3.addComponent(circle2);
        composite3.addComponent(circle3);

        composite1.addComponent(composite2);
        composite1.addComponent(composite3);

        composite1.draw();


    }
}

interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Hi, I am Square.");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Hi, I am Triangle.");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Hi, I am Circle.");
    }
}

class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape shape : components) {
            shape.draw();
        }
    }
}
