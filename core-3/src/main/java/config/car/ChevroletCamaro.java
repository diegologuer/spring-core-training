package config.car;

import config.engine.Engine;

public class ChevroletCamaro implements Car {
    private Engine engine;

    public ChevroletCamaro(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }

}
