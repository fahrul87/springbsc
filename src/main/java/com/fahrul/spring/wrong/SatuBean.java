package com.fahrul.spring.wrong;

// Materi Circular Dependecy
public class SatuBean {
	
	private DuaBean duaBean;
	
	public SatuBean(DuaBean duaBean) {
		super();
		this.duaBean = duaBean;
	}

	

	public DuaBean getDuaBean() {
		return duaBean;
	}

	public void setDuaBean(DuaBean duaBean) {
		this.duaBean = duaBean;
	}

}
