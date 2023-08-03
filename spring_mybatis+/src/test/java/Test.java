import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.chz.dao.StudentDao;
import com.chz.pojo.Student;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//让junit在spring环境下运行
//通过@ContextConfiguration指定junit的可以获取到的ioc容器
@ContextConfiguration(locations = {"classpath:conf/spring-conf.xml"})
//查询用QueryWrapper  增删改用UpdateWrapper wrapper是条件
public class Test {
    @Autowired
    private StudentDao bean;

    @org.junit.Test
    public void query() {
        //查询全部
//        List<Student> students = bean.selectList(null);
//        System.out.println(students);
        //根据id查
//        Student student = bean.selectById(1);
//        System.out.println(student);
        //批量查询Batch
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        Collections.addAll(list,3,4,5);
//        List<Student> students = bean.selectBatchIds(list);
//        for (Student student : students) {
//            System.out.println(student);
//        }
        //map相当于and
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("sno",3);
        map.put("sname","ww");//and
        List<Student> students = bean.selectByMap(map);
        students.forEach(System.out::println);
    }
    @org.junit.Test
    public void queryWhere(){
        //泛型是操作的哪一个类（表）
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        //select * from student where sno between 2 and 5
        //ge 表示great equals >=2  or（）表示or eq表示等于
        wrapper.between("sno",2,5).or().ge("sage",2).eq("sname","ww");
        //拦截器中的wrapper,支持链式,
        List<Student> students = bean.selectList(wrapper);
        System.out.println(students);
    }

    @org.junit.Test
    public void insert() {
        int i = bean.insert(new Student("dy", 33));
        System.out.println(i);
    }

    @org.junit.Test
    public void delete() {
        //按照主键删除
//        bean.deleteById(1);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("sname", "ww");
        map.put("sage", 5); //and 删除名字是ww,年龄是5的
        bean.deleteByMap(map);
    }

    @org.junit.Test
    public void update() {
//        bean.updateById(new Student(3, "ww", 2));
        Student student = new Student("拉拉", 23);
        UpdateWrapper<Student> wrapper = new UpdateWrapper<>();
        wrapper.eq("sname","ww");//update student set sname=拉拉，sge=23 where sname=ww
        bean.update(student,wrapper);
    }

}
