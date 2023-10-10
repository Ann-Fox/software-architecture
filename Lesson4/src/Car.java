public abstract class Car {
    String brand;
    String model;
    int weels;
    String fuelType; // TODO: make enum
    Transmition transmitionType;

    Car(String brand, String model, Transmition transmitionType, int numWeels, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.transmitionType = transmitionType;
        this.weels = weels;
        this.fuelType = fuelType;
    }

    abstract void move();

    abstract void service();

    abstract void turnOnHeadlights();
}
