// TODO copy
// 1. Copy all created beans from previous module here
// 2. Add a V6Engine engine with "defaultV6Engine"
// 3. Add a FordBronco car with name "4x4", using the engine above.
// 4. Add a FordRaptor car with name "jurassicCar", using the engine above.
// 5. Make changes to let ParkingLot print car bean names this time.
// 6. Load the context and print all bean names using ParkingLot method.
// 7. REQUIRED CONDITION. Don't use any wiring annotations inside FordBronco & FordRaptor.


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scanning.parkingLot.ParkingLot;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        var context = new AnnotationConfigApplicationContext("scanning");

        //print all created bean names
        var a = context.getBean(ParkingLot.class);
        a.printCarsName();

    }
}
