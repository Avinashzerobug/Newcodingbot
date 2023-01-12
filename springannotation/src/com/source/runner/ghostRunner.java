package com.source.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ghost.bean.Engine;
import com.xworkz.ghost.bean.Ghost;
import com.xworkz.ghost.bean.NewsPaper;
import com.xworkz.ghost.bean.Snake;
import com.xworkz.ghost.things.GhostConfiguration;

public class ghostRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		
		System.out.println("==========================================NewsPaper=====================================");
		
		NewsPaper refOfNews = container.getBean(NewsPaper.class);
		System.out.println(refOfNews.getId());
		System.out.println(refOfNews.getLang());
		System.out.println(refOfNews.getName());
		System.out.println(refOfNews.getOwnerName());
		System.out.println(refOfNews.getPrice());
		
		System.out.println("===================================Engine=======================================");

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine.getCompany());
		System.out.println(refOfEngine.getName());
		System.out.println(refOfEngine.getNumber());
		System.out.println(refOfEngine.getStrokes());
		System.out.println(refOfEngine.getType());
		System.out.println(refOfEngine.getVersion());
		
		System.out.println("======================================Snake===================================");
		
		Snake refOfSnake = container.getBean(Snake.class);
		System.out.println(refOfSnake);
		
		System.out.println("=======================================Ghost=========================================");
		
		Ghost refOfGhost = container.getBean(Ghost.class);
		System.out.println(refOfGhost);
	}

}
