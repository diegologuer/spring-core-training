package config.ParkingLot;

import config.car.Car;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


public class FreeParkingLot implements ParkingLot{

    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void printCarsCount() {System.out.println("Quantity of Cars: " + cars.size());
    }
}
