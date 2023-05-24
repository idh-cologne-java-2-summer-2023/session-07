package idh.java;

import java.util.HashSet;

public class Student extends Object {
	String name;
	int matrikelNummer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int mNum) {
		super();
		this.name = name;
		this.matrikelNummer = mNum;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object o) {
		if (! (o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.matrikelNummer == s.matrikelNummer;
	}
	
	public int hashCode() {
		return matrikelNummer;
	}
	
}
