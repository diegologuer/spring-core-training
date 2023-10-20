package app.car;

import app.engine.Engine;


public class FordBronco implements Car{

    private Engine engine;

    public FordBronco(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car started...");
    }
}
