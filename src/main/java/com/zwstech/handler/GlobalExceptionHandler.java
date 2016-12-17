package com.zwstech.handler;

import com.zwstech.domain.DataWrapper;
import com.zwstech.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wutairui on 2016/12/15.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public DataWrapper<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        DataWrapper<String> d = new DataWrapper<String>();
        d.setMessage(e.getMessage());
        d.setCode(DataWrapper.ERROR);
        d.setData("Some Data");
        d.setUrl(req.getRequestURL().toString());
        return d;
    }
}
