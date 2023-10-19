// TODO create spring application context with two beans
// 1. V12Engine engine with name "powerOverwhelmingStuff"
// 2. ChevroletCamaro car with name "wheelsOfDevil", that contains the type of engine above.
// Wire it, using wiring feature through a setter.
// 3. Take all beans and print their names.
// 3a. REQUIRED CONDITION - Use configuration class while loading the context

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import scanning.parkinglot.ProjectConfig;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //print all created bean names
        String[] beanNames = context.getBeanDefinitionNames();

        for (int i = 4; i<beanNames.length; i++) {
            System.out.println(beanNames[i]);
        }


    }
}
