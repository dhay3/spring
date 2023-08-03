package org.chz.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//修饰自定义异常,一定会抛出异常
@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "我消失了哈哈哈")
public class MyResponseStatus2  extends Exception{
}
