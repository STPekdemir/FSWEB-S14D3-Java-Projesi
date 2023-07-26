package com.Workintech.Cars;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{\n" + getClass().getSimpleName() + ": {engine=" + engine + ",\n" + "cylinders=" + cylinders + ",\n"
                + "name=" + name + ",\n"
                + "wheels=" + wheels + "\n}";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;

        return car.cylinders == this.cylinders && car.name.equals(this.name);

    }
}
