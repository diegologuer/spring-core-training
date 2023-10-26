package app.config;

import app.car.*;
import app.engine.Engine;
import app.engine.FourCylinderEngine;
import app.engine.V12Engine;
import app.engine.V6Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:context.properties")
public class ProjectConfig {


    @Bean
    Engine defaultV6Engine(@Value("${ford.engine.cylinders}") int cylinders){
        var e = new V6Engine();
        e.setQuantityOfCylinders(cylinders);
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
    Car Bumblebee(@Qualifier("oldSchoolStuff") Engine engine, @Value("${volkswagen.oil}") String oil){
        var e = new VolkswagenBeetle(engine);
        e.setOil(oil);
        return e;
    }

    @Bean
    Car wheelsOfDevil(@Qualifier("powerOverwhelmingStuff") Engine engine,
                      @Value("${chevrolet.maxSpeed:300}") int maxSpeed){
        var e = new ChevroletCamaro(engine);
        e.setMaxSpeed(maxSpeed);
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

    @Bean
    @Lazy
    Car teslaHover(@Qualifier("plasmaEngine") Engine engine){
        var e = new TeslaHover(engine);
        return e;
    }

    @Bean
    Car teslaHoverPlus(@Qualifier("plasmaEnginePlus") @Autowired(required = false) Engine engine){
        var e = new TeslaHoverPlus(engine);
        return e;
    }


}
