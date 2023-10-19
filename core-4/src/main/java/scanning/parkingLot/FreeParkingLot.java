package scanning.parkingLot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import scanning.car.Car;

import java.util.List;
import java.util.Map;

@Component(value = "freeParkingLot")
public class FreeParkingLot implements ParkingLot{

    private String[] allCars;
    @Autowired
    Map<String,Car> cars;

    @Override
    public void printCarsName() {
        for (String element : cars.keySet()){
            System.out.println(element);
        }
    }
}
