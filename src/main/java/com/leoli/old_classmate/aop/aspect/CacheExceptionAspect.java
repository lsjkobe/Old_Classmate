package com.leoli.old_classmate.aop.aspect;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CacheExceptionAspect {

    private final Logger LOGGER = LogManager.getLogger(CacheExceptionAspect.class);
    
    @Pointcut(value = "execution(* com.leoli.old_classmate.common.utils.RedisUtil.*(..))")
    private void cachePointCut(){}

    @Around(value = "cachePointCut()")
    private Object aroundCacheMethod(ProceedingJoinPoint pjd){
        Object o = null;
        try {
            o = pjd.proceed();
        } catch (Throwable throwable) {
            LOGGER.error(pjd.getClass()+"->"+throwable.getMessage());
        }
        return o;
    }
}
