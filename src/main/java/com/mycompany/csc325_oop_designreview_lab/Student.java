package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private double gpa;
    private String address;
    private int credits;

    // constructor without credits, (general students, for the first line in main method)
    public Student(String name, short age) {
        super(name, age);
        this.credits = 0; // default placeholder value
    }


    // constructor
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Getter for address
    @Override
    public String getAddress() { return this.address; }

    // Setter for address
    @Override
    public void setAddress(String address) { this.address = address; }

    // Getter for GPA
    public double getGpa() { return gpa; }

    // Setter for GPA
    public void setGpa(double gpa) { this.gpa = gpa; }

    public int getCredits() { return credits; }

    public void setCredits(int credits) { this.credits = credits; }

    @Override
    public String toString() {
        return "Student Name: " + getName() + ", GPA: " + getAge() +
                ", credits: " + credits + ", GPA: " + gpa + "}";
    }

    // ToDo 1: Make this class a child of Human ✔️
	// ToDo 2: Fix the resulting errors ✔️
	// ToDo 3: Add a field for GPA and create a setter and a getter ✔️
	// ToDo 4: Add comments to your code
}
