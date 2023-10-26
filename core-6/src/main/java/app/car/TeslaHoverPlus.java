package app.car;

import app.engine.Engine;

public class TeslaHoverPlus implements Car{

    public final Engine engine;

    public TeslaHoverPlus(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car started...");
    }
}
