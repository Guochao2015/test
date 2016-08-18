package com.webcomplete.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * �쳣֪ͨ
 * @author DELL
 *
 */
public class ThrowAdvice implements ThrowsAdvice {
	public void afterThrowing(Method m,Object[] os,Object target,Exception throwable)  
    {  }  
}
