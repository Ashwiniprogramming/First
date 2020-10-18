package com.xworkz.abstraction.assignment;

public class LaptopTester {

	public static void main(String[] args) {
 
		LenovoLaptop lenovolaptop =new  LenovoLaptop();
		lenovolaptop.Brand = "Lenovo";
		lenovolaptop.Processor ="core i3";
        lenovolaptop.RAM = 4;
        lenovolaptop.Operatingsystem ="windows 10";
        lenovolaptop.Price = 39000;
        
        lenovolaptop.videocall();
        lenovolaptop.powerpoint();
        lenovolaptop.officeworks();
        lenovolaptop.displaydetails();
        
        
        System.out.println("============================");
        Laptop laptop =new LenovoLaptop();//upcasting
        laptop.Brand = "Hp";
        laptop.Processor = "core i7";
        laptop.officeworks();
        laptop.displaydetails();
        

	}

}
