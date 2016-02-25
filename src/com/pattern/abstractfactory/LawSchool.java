package com.pattern.abstractfactory;

public class LawSchool implements School {

	public Professional MakeProfessional() {
		return new Lawyer();
	}
}
