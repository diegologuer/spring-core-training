package scanning.parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import parkinglot.Engine;


public class ChevroletCamaro implements parkinglot.Car {
    private String name = "wheelsOfDevil";
    private parkinglot.Engine engine;


    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }

    public String getName() {
        return name;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
