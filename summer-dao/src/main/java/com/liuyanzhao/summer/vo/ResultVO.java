package com.liuyanzhao.summer.vo;

import lombok.Data;

/**
 * Http请求返回的最外层对象
 * @Author: 言曌
 * @Date: 2017/11/12
 * @Time: 下午12:56
 */

@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //返回的具体内容
    private T data;

    public ResultVO() {
    }

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
