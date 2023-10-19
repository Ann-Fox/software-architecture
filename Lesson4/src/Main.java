public class Main {
    public static void main(String[] args) {
        
        Lada vesta = new Lada("Vesta", Transmition.auto, FourWeelCar.numWeels, 1, Fuel.Gas);
        vesta.move();

         Audi audi = new Audi("q3", Transmition.auto, FourWeelCar.numWeels, Fuel.Petrol);
        //  подогрев сидений
        audi.heatedSeats(); 
    }
}