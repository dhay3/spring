package pojo.tiger;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Tiger {
    @Value("hu hu")
    private String name;
}
