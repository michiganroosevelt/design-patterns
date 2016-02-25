package com.pattern.abstractfactory;

public class Application {

	public static void main(String[] args) {
		School school = new MedicalSchool();
		Professional doctor = school.MakeProfessional();
		System.out.println("doctor: " + doctor.makeMoney());

		school = new LawSchool();
		Professional lawyer = school.MakeProfessional();
		System.out.println("lawyer: " + lawyer.makeMoney());

		school = new EngineeringSchool();
		Professional engineer = school.MakeProfessional();
		System.out.println("engineer: " + engineer.makeMoney());
	}

}
