package com.sample.spring.tv3;

public class TVUser {

	public static void main(String[] args) {
		//LgTv tv = new LgTv();
		//SamsungTv tv = new SamsungTv();
		//Tv tv = new LgTv();
		
		BeanContainer container = new BeanContainer();
		
		Tv tv = (Tv) container.getBean(args[0]); 
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
	}

}
