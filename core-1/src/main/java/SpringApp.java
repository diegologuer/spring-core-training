// TODO create spring application context with two beans
// 1. FourCylinderEngine engine with name "oldSchoolStuff"
// 2. VolkswagenBeetle car with name "Bumblebee", that contains the type of engine above.
// Wire it, using wiring feature through a constructor.
// 3. Take all beans and print their names.
// 3a. REQUIRED CONDITION - Use component scanning while loading the context

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import scanning.parkinglot.ProjectConfig;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //print all created bean names
        //context.getBeansOfType(Car.class).forEach((s, car) -> car.startEngine());

        String[] beanNames = context.getBeanNamesForAnnotation(Component.class);

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
