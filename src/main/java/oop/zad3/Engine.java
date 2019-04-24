package oop.zad3;

public class Engine {

    double capacity;
    int horsePower;
    double fuelConsumpcion;

    public Engine(double capacity, int horsePower, double fuelConsumpcion) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumpcion = fuelConsumpcion;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsumpcion() {
        return fuelConsumpcion;
    }

    public void setFuelConsumpcion(double fuelConsumpcion) {
        this.fuelConsumpcion = fuelConsumpcion;
    }
}
