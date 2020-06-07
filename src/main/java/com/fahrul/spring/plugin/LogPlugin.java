package com.fahrul.spring.plugin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

// Materi Extension Point

@Component
public class LogPlugin extends InstantiationAwareBeanPostProcessorAdapter {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Telah dibuat bean dengan nama " + beanName+" dengan type" + bean.getClass().getName());
		return bean;
	}

}
