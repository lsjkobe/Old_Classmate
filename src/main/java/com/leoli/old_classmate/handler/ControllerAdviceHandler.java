package com.leoli.old_classmate.handler;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================


import com.leoli.old_classmate.model.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerAdviceHandler {

    private Logger logger = LogManager.getLogger(ControllerAdviceHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    private Result handleException(Exception e){
        logger.error(e);
        return Result.OTHER_ERROR;
    }
}
