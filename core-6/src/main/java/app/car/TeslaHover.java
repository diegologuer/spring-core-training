package app.car;

import app.engine.Engine;

public class TeslaHover implements Car {

    private Engine engine;

    public TeslaHover(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car started...");
    }
}
