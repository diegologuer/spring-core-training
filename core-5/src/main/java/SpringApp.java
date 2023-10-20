// TODO
// 1. Copy all files from previous project.
// 2. There is context.properties file in the resources folder
// 3. Find a way to import all properties to the context.
// 4. Using @Value annotation, inject quantity of cylinders into V6Engine bean.
// 5. Using @Value annotation, inject oil name in the VolkswagenBeetle bean.
// 6. Using @Value annotation, inject max speed number into ChevroletCamaro bean with 300 as a default value.
// 7. Override toString method of those beans and print these injected properties after loading the context.

import app.car.ChevroletCamaro;
import app.car.VolkswagenBeetle;
import app.config.ProjectConfig;
import app.engine.V6Engine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // print injected properties there
        var a = context.getBean(V6Engine.class);
        var b = context.getBean(VolkswagenBeetle.class);
        var c = context.getBean(ChevroletCamaro.class);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
