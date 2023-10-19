public class SwimCar extends Car {

    public SwimCar(String model, Transmition transmitionType, int numWeels, Fuel fuelType) {
        super("SwimCar", model, transmitionType, 0, fuelType);
    }

    private boolean enabledHeated = false;

    void heatedSeats() {
        enabledHeated = !enabledHeated;
        if (enabledHeated)
            System.out.println("Heated enabled");
        else
            System.out.println("Heated disabled");
    }

    @Override
    void move() {
        System.out.println("SwimCar is moving");
    }

    @Override
    void service() {
        System.out.println("SwimCar is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}
