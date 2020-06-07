package com.fahrul.spring.wrong;

//Materi Circular Dependecy

public class TigaBean {
	
	private SatuBean satuBean;

	public TigaBean(SatuBean satuBean) {
		super();
		this.satuBean = satuBean;
	}

	public SatuBean getSatuBean() {
		return satuBean;
	}

	public void setSatuBean(SatuBean satuBean) {
		this.satuBean = satuBean;
	}
	
	
	
	
	

}
