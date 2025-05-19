package com.vehicles.parts;

public class  Engine{											
	public String engineType;
	
	public int  horsePower ;
	
	
	public void setEngineType(String engineType){

		this.engineType=engineType;
	}
	
	
	public void setHorsePower(int horsePower ){

		this.horsePower = horsePower ;
	}

	
	public String getEngineType(){

		return engineType;
	}
	
		
	public int  getHorsePower(){

		return horsePower ;
	}

	public void showEngineDetails(){

		System.out.println("EngineType  :" +engineType);
		
		System.out.println("Horsepower :" +horsePower  );
	}

}