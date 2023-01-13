package com.source.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.source.component.Battery;
import com.source.component.Camera;
import com.source.component.CameraMan;
import com.source.component.Company;
import com.source.component.Director;
import com.source.component.Experience;
import com.source.component.Location;
import com.source.component.Producer;
import com.source.configuration.AllClassConfiguaration;

public class AllClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(AllClassConfiguaration.class);
		
	  System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		Producer hombale = context.getBean(Producer.class);
		hombale.checking();
		Company hombale1 = context.getBean(Company.class);
		hombale1.company();
		Location hombale2 = context.getBean(Location.class);
		hombale.checking();
		
		System.out.println(System.lineSeparator());
		System.out.println("***********SECOND ONE TASK************");
		
		  System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		Director hombale3 = context.getBean(Director.class);
		hombale3.director();
		Experience hombale4 = context.getBean(Experience.class);
		hombale4.experience();
		CameraMan hombale5 = context.getBean(CameraMan.class);
		hombale5.cameraMan();
		Camera hombale6 = context.getBean(Camera.class);
		hombale6.camera();
		Battery hombale7 = context.getBean(Battery.class);
		hombale7.battery();
		
		
		
	}

}
