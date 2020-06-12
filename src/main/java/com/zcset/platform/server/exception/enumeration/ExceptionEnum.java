package com.zcset.platform.server.exception.enumeration;
import lombok.Getter;

@Getter
public enum ExceptionEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    USER_NOT_FIND(-101, "用户不存在"),
    USER_NOT_DELETE(0, "删除用户失败"),
    USER_NOT_UPDATE(0, "用户数据修改失败"),
    USER_NOT_INSERT(0, "用户数据上传失败"),
    ;
    private int code;
    private String msg;

    ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}