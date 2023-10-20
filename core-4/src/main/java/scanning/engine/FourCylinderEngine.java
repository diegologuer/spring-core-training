package scanning.engine;

import org.springframework.stereotype.Component;

@Component(value="oldSchoolStuff")
public class FourCylinderEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Engine starts...");
    }

}
