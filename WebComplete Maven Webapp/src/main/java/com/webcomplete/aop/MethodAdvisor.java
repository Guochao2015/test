package com.webcomplete.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Around »·ÈÆÍ¨Öª
 * @author DELL
 *
 */
public class MethodAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try{
			return invocation.proceed();
		}finally{
			
		}
	}

}
