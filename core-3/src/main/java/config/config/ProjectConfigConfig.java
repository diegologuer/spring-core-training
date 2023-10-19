package config.config;


import config.ParkingLot.FreeParkingLot;
import config.ParkingLot.ParkingLot;
import config.car.Car;
import config.car.ChevroletCamaro;
import config.car.VolkswagenBeetle;
import config.engine.Engine;
import config.engine.FourCylinderEngine;
import config.engine.V12Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProjectConfigConfig {

    @Bean
    Car wheelsOfDevil(){
        return new ChevroletCamaro(powerOverwhelmingStuff());
    }

    @Bean
    Car bumblebee(){
        return new VolkswagenBeetle(oldSchoolStuff());
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
    ParkingLot freeParkingLot(){
        var freeParkingLot = new FreeParkingLot();
        freeParkingLot.setCars(List.of(wheelsOfDevil(),bumblebee()));
        return freeParkingLot;
    }

}
