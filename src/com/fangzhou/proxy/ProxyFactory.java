package com.fangzhou.proxy;

import java.lang.reflect.Proxy;

import com.fangzhou.main.VideoFileManager;

public class ProxyFactory {
	public static Object newInstance(Object ob, String safeOrUnsafe) {
		return Proxy.newProxyInstance(ob.getClass().getClassLoader(),
				new Class<?>[] { VideoFileManager.class }, new MyInvocationHandler(ob, safeOrUnsafe));
	}
}

