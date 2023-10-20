package scanning.car;

import org.springframework.beans.factory.annotation.Qualifier;
import scanning.engine.Engine;
import org.springframework.stereotype.Component;

@Component(value="Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;

    public VolkswagenBeetle(@Qualifier("oldSchoolStuff") Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }


}
