package com.adhiraj.beans;

import java.util.List;

public class Subjects {
	private List<String> subjects;

	public Subjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return subjects.toString();
	}
}
