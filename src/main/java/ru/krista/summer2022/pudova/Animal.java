package ru.krista.summer2022.pudova;

public class Animal {
    private final double runningSpeed;
    private final double swimmingSpeed;
    private final boolean jump;
    private final String coatColor;
    private final boolean tail;
    private final String animalType;
    private double timePath;

    public Animal(double runningSpeed, double swimmingSpeed, boolean jump, String coatColor, boolean tail, String animalType) {
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.jump = jump;
        this.coatColor = coatColor;
        this.tail = tail;
        this.animalType = animalType;
    }

    public void timePath(int earth, int water, boolean barrier) {
        if (!jump & barrier){
            this.timePath = 0;
            return;
        }
        double earthTime = earth / mpsToKmh(runningSpeed);
        double waterTime = water / mpsToKmh(swimmingSpeed);
        this.timePath = (earthTime + waterTime) * 60;
    }

    private double mpsToKmh(double mps) {
        return mps / 0.277777778;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public boolean isJump() {
        return jump;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public boolean isTail() {
        return tail;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getTimePath() {
        return timePath;
    }
}
