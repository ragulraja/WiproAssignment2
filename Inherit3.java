package WiproAssignment3;
	class persons{
		String Name ="Teacher";
	}
	class student{
		String Name1 = "Student";
	} 
	class teacher extends persons{
		int salary = 5000;
		String Subject = "Chemistry";
		teacher() {
			System.out.println("Name=" +Name +"\n" + "salary =" +salary+"\n"+ "Subject =" +Subject  );
		}
	}
	class collegeStudent extends student{
		
		String major = "Computer Engineering";
		collegeStudent() {
			System.out.println("Name=" +Name1 +"\n" + "major=" +major);

		}
			}
public class Inherit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//teacher t = new teacher();
		//t.teacher();
		collegeStudent a = new collegeStudent();
	}

}
