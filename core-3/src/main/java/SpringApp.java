// TODO
// 1. Copy all created beans into this module and create two contexts
// 1a. The first context should be loaded with scanning feature and contain 4 beans (2 cars, 2 engines)
// 1b. The second context should be loaded with configuration class and contain 4 beans (2 cars, 2 engines).
// REQUIRED CONDITION. Configuration context should not use direct method calls for bean wiring.
// 2. Create FreeParkingLot bean for every context and collect all available car beans inside with list. Use field wiring feature this time, if possible.
// 3. ParkingLot should print QUANTITY of Car beans inside.
// 4. Create application context an print all bean names once again.

import config.config.ProjectConfigConfig;
import scanning.parkingLot.ParkingLot;
import scanning.car.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scanning.engine.Engine;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        var context1 = new AnnotationConfigApplicationContext("scanning");
        var context2 = new AnnotationConfigApplicationContext(ProjectConfigConfig.class);

        System.out.println("-----------Context 1-----------");
        //print all created bean names
        context1.getBeansOfType(Engine.class).forEach((bean, engine) -> System.out.println( bean));
        context1.getBeansOfType(Car.class).forEach((bean, car) -> System.out.println( bean));

        //print quantity of cars
        var a = context1.getBean(ParkingLot.class);
        a.printCarsCount();

        System.out.println("-----------Context 2-----------");

        //print all created bean names
        context2.getBeansOfType(config.engine.Engine.class).forEach((bean, engine) -> System.out.println( bean));
        context2.getBeansOfType(config.car.Car.class).forEach((bean, car) -> System.out.println( bean));

        //print quantity of cars
        var b = context2.getBean(config.parkingLot.ParkingLot.class);
        b.printCarsCount();

    }
}
