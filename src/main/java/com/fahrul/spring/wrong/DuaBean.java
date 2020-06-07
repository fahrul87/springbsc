package com.fahrul.spring.wrong;

//Materi Circular Dependecy

public class DuaBean {
	
	private TigaBean tigaBean;

	public DuaBean(TigaBean tigaBean) {
		super();
		this.tigaBean = tigaBean;
	}

	public TigaBean getTigaBean() {
		return tigaBean;
	}

	public void setTigaBean(TigaBean tigaBean) {
		this.tigaBean = tigaBean;
	}
	
	
	

}
