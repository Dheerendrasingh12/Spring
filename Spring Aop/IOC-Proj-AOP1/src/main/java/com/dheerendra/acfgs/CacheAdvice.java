package com.dheerendra.acfgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{

	Map<String,Object> cache=new HashMap<String, Object>();
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		Object retVal=null;
		
		return null;
	}

}
