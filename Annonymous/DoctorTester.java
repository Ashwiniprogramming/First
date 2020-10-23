package com.xworkz.Annonymous;

public class DoctorTester {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor() {

			@Override
			public void treatment() {
				System.out.println("doctor give the treatment to patient");
			}

			@Override
			public void surgery() {
				System.out.println("doctor doing operations");
				
			}
			
		};
		doctor.treatment();
		doctor.surgery();
		
		AyurvedicDoctor ayush=new AyurvedicDoctor() {

			@Override
			public void Ayurvedictreatment() {
				System.out.println("ayurvedic treatment");
			}

			@Override
			public void nosurgery() {
				System.out.println("ayurvedic doctor does not do operation");
				
			}
			
		};
		ayush.Ayurvedictreatment();
		ayush.nosurgery();
	}
}
