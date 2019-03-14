package com.leoli.old_classmate.model;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.controller.ReturnResult;

import java.io.Serializable;


public class Result2 implements Serializable {

    private final String code;
    private final String msg;
    private ReturnResult returnResult;

    public Result2(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result2(String code, String msg, ReturnResult returnResult) {
        this.code = code;
        this.msg = msg;
        this.returnResult = returnResult;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public ReturnResult getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(ReturnResult returnResult) {
        this.returnResult = returnResult;
    }
}
