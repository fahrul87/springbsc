package com.fahrul.spring;

import java.io.IOException;
import java.util.Locale;
import java.util.Set;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import com.fahrul.spring.model.Author;
import com.fahrul.spring.model.DataBean;
import com.fahrul.spring.model.FileBean;
import com.fahrul.spring.model.OtherBean;
import com.fahrul.spring.model.SampleBean;
import com.fahrul.spring.model.SayHello;
import com.fahrul.spring.model.User;
import com.fahrul.spring.service.DatabaseConfig;
import com.fahrul.spring.validation.AuthorValidator;

//@SpringBootApplication
public class FahrulSpringApplication {

	public static void main(String[] args) throws IOException {
		
		// Materi Profile
		System.setProperty("spring.profiles.active", "production");
		
		// Materi Internationalze
	//	Locale.setDefault(new Locale("in","ID"));
		
		
		ApplicationContext context = SpringApplication.run(BelajarConfiguration.class, args);
		
		//materi Spring Validator
		MessageSource messageSource = context.getBean(MessageSource.class);
		
		// print Bean
//		DataBean data = context.getBean(DataBean.class);
//		System.out.println(data.getValue());
		
		// Print Dependecy Injection
//	

		
		// materi dependecy injection 3
//		OtherBean bean = context.getBean(OtherBean.class);
//		
//		System.out.println(bean.getDataBean().getValue());
//		
//		System.out.println(bean.getSampleBean().getDataBean().getValue());
//		
		
//		SayHello hello = context.getBean(SayHello.class);
//		String response = hello.hello("Istimiwir Kiwir Kiwir");
//		System.out.println(response);
		
		
		// Materi SCope
		
//		DataBean fahrul1 = context.getBean("fahrul",DataBean.class);
//		System.out.println(fahrul1.getValue());
//		DataBean fahrul2 = context.getBean("fahrul",DataBean.class);
//		System.out.println(fahrul2.getValue());
//		DataBean fahrul3 = context.getBean("fahrul",DataBean.class);
//		System.out.println(fahrul3.getValue());
		
		
		// Materi Aware 
//		OtherBean bean = context.getBean(OtherBean.class);
//		bean.doSomething();
		
		// Materi Profile
		
//		DatabaseConfig config = context.getBean(DatabaseConfig.class);
//		
//		System.out.println(config.getValue());
		
		// Materi Internationazion
		
//		SayHello hello = context.getBean(SayHello.class);
//		
//		String respone = hello.hello("fahrul");
//		System.out.println(respone);
		
		
		// Materi Resource Loader
		
//		FileBean bean = context.getBean(FileBean.class);
//		
//		bean.printInfo();
		
		
		// Materi Property Source	
//		Author author= context.getBean(Author.class);
//		System.out.println(author.getName());
//		System.out.println(author.getEmail());
		
		
		// Materi Spring Validator
		
		Author author = new Author("fahrul","istimiwir@gmail.com");
		DataBinder dataBinder = new DataBinder(author);
		dataBinder.addValidators(new AuthorValidator());
		dataBinder.validate();
		
		BindingResult result = dataBinder.getBindingResult();
		
		if(result.hasErrors()) {
			//error
			result.getAllErrors().stream().forEach((error)->{
				String message = messageSource.getMessage(error.getCode(),null, Locale.getDefault());
				System.out.println(message);
			});
		}else {
			// Tidak terjadi error
			System.out.println("Tidak Terjadi Error");
		}
		
		
		// Materi Validator Bean
//		Validator validator = context.getBean(Validator.class);
//		
//		User user = new User();
//		user.setEmail("salah");
//		user.setId("0");
//		user.setName("");
//		
//		Set<ConstraintViolation<User>> result = validator.validate(user);
//				
//		result.forEach((constraint) ->{
//			System.out.println(constraint.getMessage());
//		});
		
	}

}
