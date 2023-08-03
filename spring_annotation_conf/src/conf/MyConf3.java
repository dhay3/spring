package conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import pojo.cat.Cat;

@Configuration//@Configuration相当于还是@Component
//@ComponentScan(basePackages = "pojo")//同样的@Component也会生效但是要加入@ComponentScan相当于扫描器
//使用excludeFilter和includeFilter时要加@
@ComponentScan(basePackages = "pojo",//会扫描当前包及子包
        excludeFilters = {
        //注解的返回值时注解的value,FilterType过滤指定类型(ANNOTATION注解形式的)
        //Annotation表示去除标记为@Cat的类扫描工作
        //ASSIGNBLE_TYPE表示除去Cat.class的扫描
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = Cat.class)})//
//            可以指定特定的业务类
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Repository.class, Service.class})})//
public class MyConf3 {
}
