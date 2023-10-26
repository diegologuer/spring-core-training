package app.car;

import app.engine.Engine;


public class FordRaptor implements Car{
    private Engine engine;

    public FordRaptor(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car started...");
    }
}
