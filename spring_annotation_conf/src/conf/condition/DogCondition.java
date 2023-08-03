package conf.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DogCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取系统环境
        Environment environment = conditionContext.getEnvironment();
        System.out.println(environment);
        String animal = environment.getProperty("animal");
        return animal.contains("dog");
    }
}
