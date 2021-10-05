package TP4;

public class TestStudent {
    public static void main(String[] args) {
		Student s1 = new Student(1,8.8);
		Student s2 = new Student(6.2);
		Student s3 = new Student(4);
		Student s4 = new Student();
		
		System.out.println("stuNum: "+s1.getStuNum()+", gpa: "+s1.getGpa());
		System.out.println("stuNum: "+s2.getStuNum()+", gpa: "+s2.getGpa());
		System.out.println("stuNum: "+s3.getStuNum()+", gpa: "+s3.getGpa());
		System.out.println("stuNum: "+s4.getStuNum()+", gpa: "+s4.getGpa());
	}
}
