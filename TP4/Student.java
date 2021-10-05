package TP4;

public class Student {
    private int stuNum;
	private double gpa;

    public Student(int stuNum, double gpa)
    {
        this.stuNum = stuNum;
        this.gpa = gpa;
    }

    public Student(double gpa)
    {
        this(999, gpa);
    }

    public Student(int stuNum)
    {
        this(stuNum, 0.0);
    }

    public Student()
    {
        this(0,0.0);
    }

    public int getStuNum()
    {
		return this.stuNum;
	}
	public double getGpa() 
    {
		return this.gpa;
	}
}
