import java.util.Objects;
import java.util.Scanner;

public class Student {
	
	private int roll;
	private int marks;
	private String  name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptStudent() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Rol no : ");
		roll=sc.nextInt();
		System.out.println("Enter the Marks: ");
		marks=sc.nextInt();
		System.out.println("Enter the Name ");
		name=sc.next();
	}
		
	
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		int hash=Objects.hash(this.roll);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Student) {
			Student other = (Student)obj;
			if(this.roll==other.roll)
				
			return true;
			
		}
		return false;
			
		}
	

	
	
	
	

}
