package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
