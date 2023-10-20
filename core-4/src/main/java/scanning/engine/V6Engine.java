package scanning.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "defaultV6Engine")
@Primary
public class V6Engine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine starts...");
    }
}
