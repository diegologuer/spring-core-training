package scanning.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scanning.engine.Engine;

@Component(value = "JurassicCar")
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