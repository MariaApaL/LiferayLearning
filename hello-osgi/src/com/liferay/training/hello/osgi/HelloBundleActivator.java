package com.liferay.training.hello.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloBundleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Mi primer Bundle!!");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Chao Chao Pescao");
	}

}
