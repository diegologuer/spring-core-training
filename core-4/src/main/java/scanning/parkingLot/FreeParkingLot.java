package scanning.parkingLot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import scanning.car.Car;

import java.util.List;

@Component(value = "freeParkingLot")
public class FreeParkingLot implements ParkingLot{

    private String[] allCars;

    @Autowired
    public FreeParkingLot(ApplicationContext applicationContext){
        String[] allCars = applicationContext.getBeanNamesForType(Car.class);
        this.allCars = allCars;
    }

    @Override
    public void printCarsName() {
        for (String element : allCars){
            System.out.println(element);
        }
    }
}
