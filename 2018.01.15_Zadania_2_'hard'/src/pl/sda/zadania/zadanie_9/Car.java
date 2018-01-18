package pl.sda.zadania.zadanie_9;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int amountOfSeats;
    private double engineVolume;
    private double horsePower;
    private double currentSpeed;
    private double mileage;
    private int yearOfProduction;
    List<Passenger> passengers = new ArrayList<>();


    public void getCarName() {
        System.out.printf("Mark: %s, year of production: %d", name, yearOfProduction);
    }

    public Car(String name, double horsePower, int yearOfProduction) {
        this.name = name;
        this.horsePower = horsePower;
        this.yearOfProduction = yearOfProduction;
    }

    public void addPassanger(String imie) {
        passengers.add(new Passenger(imie));
    }

    public void addPassanger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassanger(String imie) {
        passengers.remove(imie);
    }
    public void currentSpeed(){
        System.out.printf("\nCurrent speed: %4.1f",currentSpeed);
    }

    public void speedIncrease(double speedChange) throws RuntimeException {
        if (passengers.size() < 1) throw new nieMaKierowcy();
        else {
            if (horsePower < 200) {
                while (currentSpeed < horsePower * 1.2) {
                    this.currentSpeed += speedChange;
                }
            } else {
                while (currentSpeed < horsePower) {
                    this.currentSpeed += speedChange;
                }
            }
        }
    }

    public void sppedDecrease(double speedChange) {
        if (passengers.size() > 0) this.currentSpeed -= speedChange;
    }
}
