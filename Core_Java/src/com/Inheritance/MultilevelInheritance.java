package com.Inheritance;


class Animals{  
	void eat(){
		System.out.println("eating...");
		}  
} 

class Dogs extends Animals{  
	void bark(){
		System.out.println("barking...");
		}  
} 

class BabyDog extends Dogs{  
	void weep(){
		System.out.println("weeping...");
		}  
}  

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}

}
