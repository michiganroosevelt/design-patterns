package com.pattern.abstractfactory;

public class MedicalSchool implements School {

	public Professional MakeProfessional() {
		return new Doctor();
	}
}
