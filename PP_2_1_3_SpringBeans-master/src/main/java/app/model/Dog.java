package app.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
