package scanning.engine;

import org.springframework.stereotype.Component;

@Component(value = "powerOverwhelmingStuff")
public class V12Engine implements Engine {

    public void start() {
        System.out.println("Engine starts...");
    }

}
