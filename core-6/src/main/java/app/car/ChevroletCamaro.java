package app.car;

import app.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;


public class ChevroletCamaro implements Car {
    private Engine engine;
    private int maxSpeed;

    @Autowired
    public ChevroletCamaro(Engine engine){
        this.engine = engine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }

    @Override
    public String toString(){
        return "Max speed: " + maxSpeed;
    }




}
