package Lesson25;

import org.springframework.stereotype.Component;

@Component
public class Calculator implements Divideable {
    @Override
    public double divide() {
        return (10D / 3D);
    }
}
