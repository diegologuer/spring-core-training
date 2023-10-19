package scanning.engine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="oldSchoolStuff")
@Qualifier("oldSchoolStuff")
public class FourCylinderEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Engine starts...");
    }

}
