package collections_topic;
import java.util.*;
class StudentIdComparator implements Comparator<Student>{
	public int compare(Student std1,Student std2) {
		return(std1.getStdId()-std2.getStdId());
	}
}
/*---Age comparator----*/
class AgeComparator implements Comparator<Student>{
	public int compare(Student std1,Student std2) {
		return(std1.getAge()-std2.getAge());
	}
}
public class TreeSetOfStudent {

	public static void main(String[] args) {
		/*-----------------------------------*/
		//TreeSet of student------
		TreeSet<Student> stdlist=new TreeSet<Student>(new StudentIdComparator());
		/*---- Data Insertion --------*/
		stdlist.add(new Student(23,"Amit Kumar","10th",15));
		stdlist.add(new Student(12,"Ankit Kumar","10th",14));
		stdlist.add(new Student(11,"Rahul Kumar","10th",15));
		stdlist.add(new Student(15,"Ramesh Kumar","10th",12));
		stdlist.add(new Student(21,"Anil Kumar","10th",15));
		/*-----------------------------------------------------*/
		System.out.println(stdlist);

	}

}
