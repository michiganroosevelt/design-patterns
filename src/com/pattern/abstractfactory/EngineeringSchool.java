package com.pattern.abstractfactory;

public class EngineeringSchool implements School {

	public Professional MakeProfessional() {
		return new MechinicalEngineer();
	}
}
