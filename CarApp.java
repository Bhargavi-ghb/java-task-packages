package com.vehicles.app;

import com.vehicles.Car;

import com.vehicles.parts.Engine;


public class CarApp{

	public static void main(String []args){
		
		Car car=new Car();
		car.setBrand ("BMW");
		car.setModel ("X5");
		car.setPrice (7900000.0);


		 Engine engine=new Engine();
		 engine.setEngineType("petrol");
		 engine.setHorsePower(335);

		
		car.showCarDetails();
		System.out.println();
		engine.showEngineDetails();

		
	}

}