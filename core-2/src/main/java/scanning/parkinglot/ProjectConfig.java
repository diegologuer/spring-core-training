package scanning.parkinglot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    parkinglot.Car chevroletCamaro(){
        var chevroletCamaro = new ChevroletCamaro();
        chevroletCamaro.setEngine(v12Engine());
        return chevroletCamaro;
    }

    @Bean
    parkinglot.Engine v12Engine(){
        var v12Engine = new V12Engine();
        return v12Engine;
    }
}
