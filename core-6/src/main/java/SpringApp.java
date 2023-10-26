// TODO
// 1. Copy all files from previous project.
// 2. Create a new TeslaHover car. Inject an Engine bean with name "plasmaEngine", although don't create this bean.
// 3. Try to load context, find a way to resolve that issue without creating a real engine bean.
// 4. Create a new TeslaHoverPlus car. Inject an Engine bean with name "plasmaEnginePlus", although don't create this bean.
// 5. Whatever you did at step 3, find another way to load the context without creating a real engine bean.

import app.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //initialize application context there
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
