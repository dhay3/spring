package test.servlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import test.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ms")
/**
 * bean的实例化对象是保存在spring ioc容器中，但是request是请求tomcat的容器
 * 将tomcat中servlet与ioc中的servlet连接，添加init（）方法
 */
public class MyServlet extends HttpServlet {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//    }

    @Override
    public void init() throws ServletException {
//        web项目无法通过普通项目方式拿值
//        ApplicationContext context = new ClassPathXmlApplicationContext("ClassPath:applicationContext.xml");
        //tomcat容器和ioc容器的桥梁
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        //将获取到的service赋值tomcat容器中的service
        this.userService= (UserService)context.getBean("userService");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("123");
        String s = userService.queryById();
        response.getWriter().write(s);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
