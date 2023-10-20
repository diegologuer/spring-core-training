package scanning.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scanning.engine.Engine;

@Component(value = "4x4")
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
