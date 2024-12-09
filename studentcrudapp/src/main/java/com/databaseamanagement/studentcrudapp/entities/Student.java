//fields should be mentioned as member variables
package com.databaseamanagement.studentcrudapp.entities;

public class Student
{
 private String stdid;
 private String stdName;
 private String standard;
 private int roll;
 private int age;
 private String address;
 
 //parameterized constructor
public Student(String stdid, String stdName, String standard, int roll, int age, String address) {
	super();
	this.stdid = stdid;
	this.stdName = stdName;
	this.standard = standard;
	this.roll = roll;
	this.age = age;
	this.address = address;
}

//default constructor
public Student() {
	super();
}

//getter and setter methods
public String getStdid() {
	return stdid;
}
public void setStdid(String stdid) {
	this.stdid = stdid;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
/*---overriding toString method--*/
//so object print in string form
@Override
public String toString() {
	return "\n Student id:" + stdid +
			"\n Student Name=" + stdName +
			"\n Standard=" + standard + 
			"\n roll=" + roll +
			"\n age="+ age +
			"\n address=" + address +
			"\n---------------------------------";
}

}
