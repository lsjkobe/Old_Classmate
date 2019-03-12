package com.leoli.old_classmate.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DateCacheAspect {

    @Pointcut(value = "execution(* com.leoli.old_classmate.serviceImpl.*.save(..))")
    private void cachePointcut(){}

    @Before("cachePointcut()")
    private void beforeProcess(JoinPoint joinPoint){

    }
}
