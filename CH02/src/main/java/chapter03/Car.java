package chapter03;

public class Car {
    String company = "현대자동차";
    String model = "그랜져";
    String color = "black";
    int maxSpeed = 360;
    int speed;

    Car() {
    }

    Car(String model) {
        this.model = model;
    }

    Car(String color, int cc) {
        this.color = color;
        this.maxSpeed = cc;
    }

    Car(String model, String color, int cc) {
        this.model = model;
        this.color = color;
        this.maxSpeed = cc;
    }
}
