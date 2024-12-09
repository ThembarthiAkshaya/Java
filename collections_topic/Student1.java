package collections_topic;

public class Student1 {
	//variable to store the student id
		private String id;
		
		//variable to store student name
		private String name;
		
		//variable to store student standard
		private String standard;
		
		//variable to store student roll number
		private int rollno;
		
		//variable to store student age
		private int age;

		//parameterized constructor
		public Student1(String id, String name, String standard, int rollno, int age) {
			super();
			this.id = id;
			this.name = name;
			this.standard = standard;
			this.rollno = rollno;
			this.age = age;
		}

		//getter method to return student id
		public String getId() {
			return id;
		}

		//setter method to set student id
		public void setId(String id) {
			this.id = id;
		}

		//getter method to return student name
		public String getName() {
			return name;
		}

		//setter method to set student id
		public void setName(String name) {
			this.name = name;
		}

		//getter method to return the student standard
		public String getStandard() {
			return standard;
		}

		//setter method to student standard
		public void setStandard(String standard) {
			this.standard = standard;
		}

		//getter method to return the roll no 
		public int getRollno() {
			return rollno;
		}

		//setter method to set the student roll no
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		//getter method to return the student age
		public int getAge() {
			return age;
		}

		//setter method to set the student age
		public void setAge(int age) {
			this.age = age;
		}
		//to print data only not the references id's of the object we used to toString
		@Override
		public String toString() {
			return "Student [stdid=" + id + "\n stdname=" + name + 
					"\n standard=" + standard + 
					"\n rollno=" + rollno+
					"\n age=" + age +"year"+"]";
		}
}
