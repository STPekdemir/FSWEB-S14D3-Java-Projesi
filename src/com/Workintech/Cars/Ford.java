package com.Workintech.Cars;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " " + getName() + "is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " " + getName() + "is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + " " + getName() + " is braking";
    }

}
