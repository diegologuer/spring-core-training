package scanning.engine;

import org.springframework.stereotype.Component;

@Component(value = "defaultV6Engine")
public class V6Engine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine starts...");
    }
}
