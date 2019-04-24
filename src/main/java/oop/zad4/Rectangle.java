package oop.zad4;

public class Rectangle extends Figure {

    private float sideA;
    private float sideB;
    private float pole;
    @Override
    float countArea() {

        return sideB*sideA;
    }

    @Override
    void displayArea() {

        System.out.println("Figura: Prostokąt, pole: ");

    }

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
