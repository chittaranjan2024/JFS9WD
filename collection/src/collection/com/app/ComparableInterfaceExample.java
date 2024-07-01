package collection.com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Student stu) {
		
		return this.name.compareTo(stu.name);  //Bat Ball
	}



	
	/*
	 * @Override public int compareTo(Student stu) {
	 * 
	 * if(this.age==stu.age) { return 0; } else if(this.age>stu.age) { return 1; }
	 * else { return -1; }
	 * 
	 * }
	 */

	
}


public class ComparableInterfaceExample {

	public static void main(String[] args) {
		
		Student student1=new Student(111, "A", 20);
		Student student2=new Student(222, "B", 24);
		Student student3=new Student(333, "C", 22);
		Student student4=new Student(444, "D", 21);
		
		List<Student> students=Arrays.asList(student1,student2,student3,student4);
		System.out.println("Before Sorting:");
		for(Student s:students)
		{
			System.out.println(s);
		}
		
		
	    Collections.sort(students);//ascending
	    Collections.sort(students, Collections.reverseOrder());
	    
	    System.out.println("After Sorting:");
		for(Student s:students)
		{
			System.out.println(s);
		}
	}

}
