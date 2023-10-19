public abstract class Car {
    // марка автомобиля
    String brand;
    // модель автомобиля
    String model;
    // количество колес
    int weels;
    // тип топлива (бензин, дизель, газ)
    Fuel fuelType; // TODO: make enum - перечисление, когда есть фиксированные значения (выпадающий список)
    // тип трансмиссии (автоматические, механические)
    Transmition transmitionType;

    Car(String brand, String model, Transmition transmitionType, int weels, Fuel fuelType) {
        this.brand = brand;
        this.model = model;
        this.transmitionType = transmitionType;
        this.weels = weels;
        this.fuelType = fuelType;
    }
// движение
    abstract void move();
// сервис
    abstract void service();
// вкл/выкл фонарей
    abstract void turnOnHeadlights();
}
