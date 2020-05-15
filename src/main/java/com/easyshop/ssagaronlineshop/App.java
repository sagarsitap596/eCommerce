package com.easyshop.ssagaronlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class App {
	public static void main(String[] args) {
		//SpringApplication.run(App.class, args);
		B b = new B(22);
		System.out.println(b.a);
		
	}
	
	
}

class A {
	protected Integer a;

	public void show() {
		System.out.println(a);
	}
}

class B extends A {

	public B(Integer a) {
		super.a = a;
	}
}
