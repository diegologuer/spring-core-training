package config.config;


import config.parkingLot.FreeParkingLot;
import config.parkingLot.ParkingLot;
import config.car.Car;
import config.car.ChevroletCamaro;
import config.car.VolkswagenBeetle;
import config.engine.Engine;
import config.engine.FourCylinderEngine;
import config.engine.V12Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.List;

@Configuration
public class ProjectConfigConfig {

    @Bean
    Car wheelsOfDevil(@Qualifier("powerOverwhelmingStuff") Engine engine){
        return new ChevroletCamaro(engine);
    }

    @Bean
    Car bumblebee(@Qualifier("oldSchoolStuff") Engine engine){
        return new VolkswagenBeetle(engine);
    }

    @Bean
    Engine oldSchoolStuff(){
        return new FourCylinderEngine();
    }

    @Bean
    Engine powerOverwhelmingStuff(){
        return new V12Engine();
    }

    @Bean
    @DependsOn({"wheelsOfDevil", "bumblebee"})
    ParkingLot freeParkingLot(List<Car> cars){
        var freeParkingLot = new FreeParkingLot();
        freeParkingLot.setCars(cars);
        return freeParkingLot;
    }

}
