package scanning.ParkingLot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scanning.car.Car;

import java.util.ArrayList;
import java.util.List;

@Component(value = "freeParkingLot")
public class FreeParkingLot implements ParkingLot{
    @Autowired
    private List<Car> cars;
    @Override
    public void printCarsCount() {
        System.out.println("Quantity of cars: " + cars.size());
    }
}
