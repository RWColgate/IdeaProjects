package pl.sda.zadania.zadanie_9;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 100, 1960);
        Passenger passenger1 = new Passenger("Tim");
        Passenger passenger2 = new Passenger("Tomek");
        Passenger passenger3 = new Passenger("Tadeusz");

        car.getCarName();
        car.addPassanger(passenger1);
        car.speedIncrease(50);
        car.currentSpeed();
        car.addPassanger(passenger2);
        car.addPassanger(passenger3);
    }
}
