package org.chz.handler;

import org.chz.dto.User;
import org.chz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class MyHandler {
    UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("query")
    public String queryAll(
            User user,
            @RequestParam("file") MultipartFile multipartFile, BindingResult bindingResult,
            HttpServletRequest request) throws IOException {
//        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
//        IUserService service = (UserServiceImpl)context.getBean("service");
        if (bindingResult.hasErrors()||userService.queryByName(user)==null){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getDefaultMessage());
            }
            return "error";
        }
        String realPath = request.getServletContext().getRealPath("/");
        String filename = multipartFile.getOriginalFilename();
        File file = new File(realPath + "/file/", filename);
        System.out.println(realPath);
        multipartFile.transferTo(file);
        return "success";
    }
}
