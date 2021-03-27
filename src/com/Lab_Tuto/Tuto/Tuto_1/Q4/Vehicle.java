package com.Lab_Tuto.Tuto.Tuto_1.Q4;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed)
            accelerate();
    }

    // cannot create an instance of an abstract class Vehicle as abstract class cannot be instantiated
}
