package de.neuefische;
public class Car {
    public String brand;
    public String model;
    public String color;
    public int builtYear;
    public int speedInKMH = 0;

    public Car(String brand, String model, String color, int builtYear) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.builtYear = builtYear;
    }

    public void startTheCar() {
      System.out.println("Car has brum brum!");
    }

    public void accelearateCar() {
        speedInKMH += 10;
    }
}
