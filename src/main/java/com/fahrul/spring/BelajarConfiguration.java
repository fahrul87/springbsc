package com.fahrul.spring;

import java.util.UUID;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.fahrul.spring.model.Author;
import com.fahrul.spring.model.DataBean;
import com.fahrul.spring.model.OtherBean;
import com.fahrul.spring.model.SampleBean;
import com.fahrul.spring.service.DatabaseConfig;

// Materi Container
@SpringBootApplication
//Materi Circular Dependecy
//@Import(WrongConfiguration.class)

// Materi PropertiesSource

//@PropertySources({ //(lebih dari satu propertySource
//	@PropertySource("classpath:/configurations/contoh.properties")
//
//})

@PropertySource("classpath:/configurations/contoh.properties")


public class BelajarConfiguration {
	
	// Materi Property Source
	@Autowired
	private Environment environment;
	
	// Materi Bean Validation
//	@Bean
//	public Validator createValidator() {
//		return new LocalValidatorFactoryBean();
//	}
	
	// Materi Property Source
//	@Bean
//	public Author createAuthor() {
//		String name = environment.getProperty("author.name");
//		String email = environment.getProperty("author.email");
//		Author author = new Author(name,email);
//		return author;
//	}
	
	// Materi Bean
//	@Bean
	// Materi Dependecy Injection 2
//	@Bean(name = "fahrul")
////	@Primary
//	public DataBean createDataBean() {
//		DataBean bean = new DataBean("Fahrul Istimiwir");
//		return bean;
//	}
	
	// Materi Scope
	@Bean(name = "fahrul")
//	@Primary
	@Scope("prototype")
	public DataBean createDataBean() {
		String random = UUID.randomUUID().toString();
		DataBean bean = new DataBean(random);
		return bean;
	}
	
//	@Bean
//	@Primary
	@Bean(name = "istimintil")
	public DataBean createDataBean2() {
		DataBean bean = new DataBean("Fahrul Istimintil");
		return bean;
	}
	
	
	//Materi Dependcy Injection
//	@Bean
//	public SampleBean createSampleBean(DataBean dataBean) {
//		SampleBean bean= new SampleBean(dataBean);
//		return bean;
//	}
	
	// Bean DI 2 
	@Bean
	public SampleBean createSampleBean(@Qualifier("fahrul") DataBean dataBean) {
		SampleBean bean= new SampleBean(dataBean);
		return bean;
	}
	
	// materi dependecy injection 3
	@Bean
	public OtherBean createOtherBean(@Qualifier("istimintil")DataBean dataBean,SampleBean sampleBean) {
	OtherBean bean = new OtherBean(dataBean,sampleBean);
	return bean;
	}
	
	// Materi Profile
	
	@Bean
	@Profile("development")
	public DatabaseConfig createDevDatabaseConfig() {
		return new DatabaseConfig("DATABASE DEVELOPMENT");
	}
	@Bean
	@Profile("production")
	public DatabaseConfig createProdDatabaseConfig() {
		return new DatabaseConfig("DATABASE PRODUCTION");
	}
	
	// Materi Internationalizme
	@Bean(name = "messageSource")
	public MessageSource createMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource()	;
		messageSource.setBasename("messages.hello");
		return messageSource;
	}

}
