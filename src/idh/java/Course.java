package idh.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import idh.java.util.NameGenerator;

public class Course implements Iterable<Student> {
	 // Student[] members;
	Map<String, Student> kvMembers = new HashMap<String, Student>();
	
	int nextPosition = 0;
	String name;


	public Course(String name, int numberOfStudents) {
		// this.members = new Student[numberOfStudents];
		this.name = name;
	}
	
	public void addMember(Student student) throws Exception {
//		if (nextPosition < members.length)
//			members[nextPosition++] = student;
//		else
//			throw new Exception("Class full");
		kvMembers.put(student.getName(), student);
	}
	
	
	public void addMember(String name) throws Exception {
		this.addMember(new Student(name, 0));
	}
	
	public int size() {
		return kvMembers.size();
	}
	
	public Student getMember(String name) {
		return kvMembers.get(name);
	}
	
	public Student getMember(int member) {
		for (Student s : kvMembers.values()) {
			if (s.matrikelNummer == member)
				return s;
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}


	public static void main(String[] args) throws Exception {
		NameGenerator ng = new NameGenerator();
		
		Course course = new Course("Java 7", 30);
		
		course.addMember(new Student(ng.getName(), 0));
	}

}
