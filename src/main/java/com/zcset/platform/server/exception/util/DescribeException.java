package com.zcset.platform.server.exception.util;

import com.zcset.platform.server.exception.enumeration.ExceptionEnum;

public class DescribeException extends RuntimeException {

    private int code;

    /**
     * 继承exception，加入错误状态值
     *
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     *
     * @param message
     * @param code
     */
    public DescribeException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
