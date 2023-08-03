package pojo.cat;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Cat {
    @Value("mimi")
    private String name;
}
