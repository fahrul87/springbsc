package com.fahrul.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fahrul.spring.wrong.DuaBean;
import com.fahrul.spring.wrong.SatuBean;
import com.fahrul.spring.wrong.TigaBean;

//Materi Circular Dependecy
@Configuration
public class WrongConfiguration {
	
//	@Bean
//	public SatuBean createSatuBean(DuaBean duaBean) {
//		return new SatuBean(duaBean);
//	}
//	
//	@Bean
//	public DuaBean createDuaBean(TigaBean tigaBean) {
//		return new DuaBean(tigaBean);
//	}
//	
//	@Bean
//	public TigaBean createTigaBean(SatuBean satuBean) {
//		return new TigaBean(satuBean);
//	}

}
