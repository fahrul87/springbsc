package com.fahrul.spring.model;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

// Materi Resource Loader

@Component
public class FileBean implements ResourceLoaderAware {
	
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
		
	}
	
	public void printInfo() throws IOException {
		Resource resource = loader.getResource("classpath:/resources/info.txt");
		Scanner scanner = new Scanner(resource.getInputStream());
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
		
	}

}
