package scanning.parkinglot;

import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class VolkswagenBeetle implements parkinglot.Car {

    private String name = "Bumblebee";
    private Engine engine;

    public VolkswagenBeetle(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car: " + name + ", starts...");
    }


}
