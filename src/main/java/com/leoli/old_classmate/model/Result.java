package com.leoli.old_classmate.model;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.leoli.old_classmate.entity.ReturnResult;

//序列化整个对象
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Result {
    OK("200", "成功"),
    ERROR_404("404", "404错误"),
    ERROR_EMPTY("411", "没找到"),
    OTHER_ERROR("499", "其它错误");



    private String code;
    private String msg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Result buildResult(Object data){
        this.setData(data);
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
//    @JsonValue 只序列化特定的field

}
