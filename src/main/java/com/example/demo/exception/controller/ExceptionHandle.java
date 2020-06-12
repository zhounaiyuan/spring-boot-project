package com.example.demo.exception.controller;

import com.example.demo.exception.entity.Result;
import com.example.demo.exception.enumeration.ExceptionEnum;
import com.example.demo.exception.util.DescribeException;
import com.example.demo.exception.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class ExceptionHandle {
    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e) {
        if (e instanceof DescribeException) {
            DescribeException MyException = (DescribeException) e;
            return ResultUtil.error(MyException.getCode(), MyException.getMessage());
        }
        log.error("【系统异常】{}", e);
        return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
