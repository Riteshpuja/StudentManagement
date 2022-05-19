

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {

	public static void main(String[] args) throws IOException {

System.out.println("Welcome to StudentManagement App");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
	System.out.println("Press 1 to ADD student");
	System.out.println("Press 2 to DELETE student");
	System.out.println("press 3 to Display student");
	System.out.println("press 4 to exit app");
	int c=Integer.parseInt(br.readLine());
	
	if(c==1) {
		//add student code......
		System.out.println("Enter UserName:");
		String name =br.readLine();
		System.out.println("Enter User Phone:");
		String phone =br.readLine();
		System.out.println("Enter User City:");
		String city =br.readLine();
		// create student object to store student
		Student st = new Student(name,phone,city);
		boolean answer= StudentDao.insertStudentToDB(st);
		if(answer) {
			System.out.println("Submitted Successfully");
		}else {
			System.out.println("Something Went Wrong");
			System.out.println("....Try Again....");
		}
		System.out.println(st); 
	}else if(c==2) {
		//delete student code...
		System.out.println("Enter student id to Delete:");
		int userId=Integer.parseInt(br.readLine());
		boolean f=StudentDao.deleteStudent(userId);
		if(f) {
			System.out.println("...Deleted SuccessFully...");
		}else {
			System.out.println("!!!!!!!!!======Something went Wrong======!!!!!!!!!!!");
		}
	}else if(c==3) {
		//Display student code...
		StudentDao.showAllStudent();
	}else if(c==4) {
		//exit code...
		break;
	}else {
		
	}
}
System.out.println("Thank You Vigit Again");

	}

}
