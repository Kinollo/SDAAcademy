package oop.zad3;

public abstract class Car {

    String producer;
    String model;
    String color;
    int seatsNumber;
    double engine;

    public Car() {
        seatsNumber=2;
    }

    public Car(String producer, String model, String color, int seatsNumber, double engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
}
