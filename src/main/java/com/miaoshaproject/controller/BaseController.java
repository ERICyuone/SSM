package com.miaoshaproject.controller;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.error.EmBusinessError;
import com.miaoshaproject.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {// 这样写会找不到一些异常的处理 无法完全捕获 如404
    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

//    //定义exceptionHandler解决未被controller层吸收的exception 自动获取错误跳转到这
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.OK)//捕获异常后仍然返回ok给前端（这是后端异常）,到success块
//    @ResponseBody
//    public Object handlerException(HttpServletRequest request, Exception ex) {
//        // ex是反序列化的异常格式 自己的格式要处理一下
//        Map<String, Object> responseData = new HashMap<>();
//        if (ex instanceof BusinessException) {
//            BusinessException businessException = (BusinessException) ex;
//            responseData.put("errCode", businessException.getErrCode());
//            responseData.put("errMsg", businessException.getErrMsg());
//        } else {
//            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrCode());
//            responseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
//        }
//        System.out.println(ex);
//        return CommonReturnType.create(responseData, "fail");
//
//    }
}
