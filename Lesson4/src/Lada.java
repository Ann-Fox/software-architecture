public class Lada extends Car{

    public int aditionalWeels;

    public Lada(String model, Transmition transmitionType, int numWeels, int aditionalWeels, String fuelType) {
        super("Lada", model, transmitionType, numWeels, fuelType);
        this.aditionalWeels = aditionalWeels;
    }

    @Override
    void move() {
        System.out.println("Lada is moving");
    }

    @Override
    void service() {
        System.out.println("Lada is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}
