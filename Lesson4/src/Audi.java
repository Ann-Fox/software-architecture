public class Audi extends Car {

    public Audi(String model, Transmition transmitionType, int numWeels, Fuel fuelType) {
        super("Audi", model, transmitionType, numWeels, fuelType);
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
        System.out.println("Audi is moving");
    }

    @Override
    void service() {
        System.out.println("Audi is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}
