package scanning.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scanning.engine.Engine;


@Component(value ="wheelsOfDevil")
public class ChevroletCamaro implements Car {
    private Engine engine;

    @Autowired
    public ChevroletCamaro(@Qualifier("powerOverwhelmingStuff") Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }





}
