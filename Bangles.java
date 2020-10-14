package com.xworkz.methodoverride.assignment;

public class Bangles {
	
		    int   price;
			String design;
		    String color;
		    String type;
		    
		    public Bangles() {
		    	
		    }
		    public Bangles(int inprice,String indesign,String incolor,String intype) {
		    	price=inprice;
				design=indesign;
		    	color=incolor;
		    	type=intype;
		    	
		    }
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getDesign() {
				return design;
			}
			public void setDesign(String design) {
				this.design = design;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String gettype() {
				return type;
			}
			public void settype(String type) {
				this.type = type;
			}

	      public void usedforbride() {
	    	  System.out.println("bride wear bangles in marriage");
			
	      }
	      public void material() {
	    	  System.out.println("bangles made up of glass");
	      }


	}






