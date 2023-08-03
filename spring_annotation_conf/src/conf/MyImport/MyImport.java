package conf.MyImport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
//实现ImportSelector接口
public class MyImport implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"pojo.cat.Cat","pojo.dog.Dog"};//返回要加入ioc容器bean的全类名
    }
}
