package app.car;


import app.engine.Engine;
import org.springframework.stereotype.Component;

@Component(value="Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;
    private String oil;

    public VolkswagenBeetle( Engine engine){
        this.engine = engine;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }


    @Override
    public String toString(){
        return "oil: " + oil;
    }
}