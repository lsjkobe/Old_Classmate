package com.leoli.old_classmate.aop.aspect;// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, leo.li, creation
// ============================================================================

import com.leoli.old_classmate.model.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class WebExceptionAspect {

    private final Logger LOGGER = LogManager.getLogger(WebExceptionAspect.class);

    @Pointcut("execution(* com.leoli.old_classmate.controller.*.*(..))")
    private void webPointcut() {
    }

    @AfterThrowing(pointcut = "webPointcut()", throwing = "e")
    private void afterThrowing(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        LOGGER.error("异常所在类：" + className);
        LOGGER.error("异常所在方法：" + methodName);
        LOGGER.error("异常: " + e.getMessage());
    }

    @Before("execution(* com.leoli.old_classmate.controller.*.*(..))")
    private void beforeProcess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        LOGGER.debug("操作所在类 ：" + className);
        LOGGER.debug("操作所在方法 ：" + methodName);
    }

//    AfterReturning("execution(* com.leoli.old_classmate.controller.*.*(..))")

//    @Around("execution(* com.leoli.old_classmate.controller.*.*(..))")
//    public Object aroundMethod(ProceedingJoinPoint pjd) {
//        Object result = null;
//        String methodName = pjd.getSignature().getName();
//        //执行目标方法
//        try {
//            //前置通知
//            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));
//            result = pjd.proceed();
//            //返回通知
//            System.out.println("The method " + methodName + " ends with " + Arrays.asList(pjd.getArgs()));
//        } catch (Throwable e) {
//            //异常通知
//            System.out.println("The method " + methodName + " occurs expection : " + e);
////            throw new RuntimeException(e);
//        }
//        //后置通知
//        System.out.println("The method " + methodName + " ends");
//        return result;
//    }
}
