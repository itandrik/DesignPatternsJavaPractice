package com.javaweb;

/**
 * Simple example of "PrototypePattern"
 *
 * @author Andrii Chernysh; E-MAIL : itcherry97@gmail.com;
 */
public class PrototypePatternMain {
    public static void main(String[] args) {
        Human human = new Human(18, "Vasya");
        System.out.println(human);

        Human copy = (Human) human.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(human);
        Human human1 = factory.makeCopy();
        System.out.println(human1);

        factory.setPrototype(new Human(30, "Valeria"));
        Human valeria = factory.makeCopy();
        System.out.println(valeria);
    }
}

interface Copyable {
    Object copy();
}

class Human implements Copyable {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(age, name);
    }

    @Override
    public String toString() {
        return "Human[" + Integer.toHexString(System.identityHashCode(this)) + "]{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class HumanFactory {
    private Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy() {
        return (Human) human.copy();
    }
}