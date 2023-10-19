package app.config;

import app.car.*;
import app.engine.Engine;
import app.engine.FourCylinderEngine;
import app.engine.V12Engine;
import app.engine.V6Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:context.properties")
public class ProjectConfig {

    @Value("${ford.engine.cylinders}")
    private int fordEngineCylinders;

    @Value("${volkswagen.oil}")
    private String volkswagenOil;

    @Value("${chevrolet.maxSpeed:300}")
    private int chevroletMaxSpeed;

    @Bean
    Engine defaultV6Engine(){
        var e = new V6Engine();
        e.setQuantityOfCylinders(fordEngineCylinders);
        return e;
    }

    @Bean
    Engine powerOverwhelmingStuff(){
        var e = new V12Engine();
        return e;
    }

    @Bean
    Engine oldSchoolStuff(){
        var e = new FourCylinderEngine();
        return e;
    }

    @Bean
    Car Bumblebee(@Qualifier("oldSchoolStuff") Engine engine){
        var e = new VolkswagenBeetle(engine);
        e.setOil(volkswagenOil);
        return e;
    }

    @Bean
    Car wheelsOfDevil(@Qualifier("powerOverwhelmingStuff") Engine engine){
        var e = new ChevroletCamaro(engine);
        e.setMaxSpeed(chevroletMaxSpeed);
        return e;
    }

    @Bean(value = "4x4")
    Car fordBronco(@Qualifier("defaultV6Engine") Engine engine){
        var e = new FordBronco(engine);
        return e;
    }

    @Bean
    Car JurassicCar(@Qualifier("defaultV6Engine") Engine engine){
        var e = new FordRaptor(engine);
        return e;
    }


}
