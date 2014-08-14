package com.fangzhou.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.fangzhou.annotation.*;
import com.fangzhou.main.*;

public class MyInvocationHandler implements InvocationHandler {
	private Object obj;
	private String safeOrUnsafe;
	
    public  MyInvocationHandler(Object obj, String safeOrUnsafe) {
        this.obj = obj;
        this.safeOrUnsafe = safeOrUnsafe;
    }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result;
		try{
			Video v = (Video)args[0];
			
			if (method.isAnnotationPresent(Learn.class)) {
				Learn annotation = method.getAnnotation(Learn.class);
				String[] features = annotation.features();
				for (String s: features) {
//					System.out.print(" - "+s+" : ");
					Method newMethod = v.getClass().getMethod(s);
					System.out.print("\""+newMethod.invoke(v)+"\",");
				}
				System.out.println("\""+safeOrUnsafe+"\"");
			}
			
//			System.out.println("args: "+v.getReturnVal() );
        	
        	result = method.invoke(obj, args);
	    } catch (InvocationTargetException e) {
	        throw e;
	    } catch (Exception e) {
	        throw e;
	    }
        return result;
	}

}
