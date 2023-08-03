package org.chz.handler;

import org.chz.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class MyServlet {
    @RequestMapping("/hello")
    @ResponseBody
    public Student hello(@RequestParam("username") String name, int password) {
        System.out.println(name + "-->" + password);
        Student student = new Student();
        student.setName(name);
        student.setPassword(password);
        return new Student();
    }

    @RequestMapping("/upload")
    public String upload(String desc, @RequestParam("file") MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        System.out.println("description:" + desc);
        //这里的/表示项目根路径
        String path = request.getServletContext().getRealPath("/");
        //获取上传的文件名
        String name = multipartFile.getOriginalFilename();
        File file = new File(path+"/file/", name);
        //Nio
        multipartFile.transferTo(file);//自动生成file不用
        return "test";
    }
    @RequestMapping("/upload2")
    //能接受封装对象
    public String him(@RequestParam("file") MultipartFile multipartFile, Student student, HttpServletRequest request) throws IOException {
        //由于这里student中属性的值来之request域中所以前端拿到的值不会是乱码
        //但是后端拿到的值就会是乱码
        System.out.println(student);
        String realPath = request.getServletContext().getRealPath("/");
        String originalFilename = multipartFile.getOriginalFilename();
        File file = new File(realPath+"/file/", originalFilename);
        multipartFile.transferTo(file);
        return "test";
    }
}
