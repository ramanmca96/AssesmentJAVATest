package Com.Question6;

public class MethodOverLoading_Program_StudentInfo {

	private void MethodOverLoading_Program_StudentInfo(int StudentID) {

		System.out.println("Student ID is:" + StudentID);
	}

	private void MethodOverLoading_Program_StudentInfo(String StudentName, String ParentName) {

		System.out.println("Student Name is:" + StudentName + "  " + " Parent Name:" + ParentName);
	}

	private void MethodOverLoading_Program_StudentInfo(String Department, char Grade) {

		System.out.println("Student Department is:" + Department + "  " + " Student Grade :" + Grade);
	}

	private void MethodOverLoading_Program_StudentInfo(String Address, long PhoneNo, float fees) {

		System.out.println("Student Address is:" + Address + "  " + " Student PhoneNo :" + PhoneNo + "  "
				+ "Student Fees:" + fees);
	}

	public static void main(String[] args) {
		MethodOverLoading_Program_StudentInfo method = new MethodOverLoading_Program_StudentInfo();

		method.MethodOverLoading_Program_StudentInfo(14861);
		method.MethodOverLoading_Program_StudentInfo("Raman", "Subramani");
		method.MethodOverLoading_Program_StudentInfo("IT", 'B');
		method.MethodOverLoading_Program_StudentInfo("Salem", 9999999999l, 48560.50f);
	}

}
