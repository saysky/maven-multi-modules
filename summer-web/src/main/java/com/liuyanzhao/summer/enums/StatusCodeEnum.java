package com.liuyanzhao.summer.enums;

/**
 * @author 言曌
 * @date 2018/7/23 上午11:02
 */
public enum StatusCodeEnum {


    SUCCESS_CODE(200, "处理成功"),
    DEFAULT_FAIL_CODE(500, "默认错误码"),
    PERMISSION_DENIED(401, "没有权限"),
    ILLEGAL_PARAM(400, "非法参数"),

    ;

    private Integer code;

    private String message;

    StatusCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
