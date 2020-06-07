package com.fahrul.spring.model;
//materi dependecy injection 3

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// Masuk Materi Aware

public class OtherBean implements ApplicationContextAware {
	
	private DataBean dataBean;
	
	private SampleBean sampleBean;
	
	// Materi Aware
	private ApplicationContext context;

	public OtherBean(DataBean dataBean, SampleBean sampleBean) {
		super();
		this.dataBean = dataBean;
		this.sampleBean = sampleBean;
	}

	public DataBean getDataBean() {
		return dataBean;
	}

	public void setDataBean(DataBean dataBean) {
		this.dataBean = dataBean;
	}

	public SampleBean getSampleBean() {
		return sampleBean;
	}

	public void setSampleBean(SampleBean sampleBean) {
		this.sampleBean = sampleBean;
	}

	// Materi Aware
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		
	}
	// Materi Aware
	public void doSomething() {
		if(context != null) {
			System.out.println("Ok, Context ada");
		}else {
			System.out.println("No, context tidak ada");
		}
	}
	
	

}


