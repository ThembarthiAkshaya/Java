//program on comparator interface example on student class
package collections_topic;

public class Student {
	private int stdId;
	private String stdName;
	private String standard;
	private int age;

	public Student(int stdId, String stdName, String standard, int age) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.standard = standard;
		this.age = age;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nStudent Id : " + stdId + "\nName : " + stdName + "\n Standard : " + standard + "\n Age : " + age
				+ "\n-------------------------------------------------";
	}
}
