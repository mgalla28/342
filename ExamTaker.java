import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ExamTaker {
	
	public static void main(String[] args){
		Scanner s = ScannerFactory.getkeyboardScanner();
		//Get student information
		System.out.print("Enter student name: ");
		String StudentName = s.nextLine();		
		System.out.println("NAME: " + s);
		
		System.out.print("What Exam file would you like to loada?");
		String fileName = s.nextLine();
		File file = new File(fileName);
		
		try{
			s = new Scanner(file);
			Exam exam = new Exam(s);
			PrintWriter pw = new PrintWriter(file);
			exam.save(pw);
			pw.flush();
			pw.close();
			System.out.println(exam.getText());
			exam.setName(StudentName);
			exam.getAllAnswers();
			exam.setFileName();
			File studentAns = new File(exam.Studentname + ".txt");
			pw = new PrintWriter(studentAns);
			exam.saveStudentAnswers(pw);
			pw.flush();
			pw.close();
			System.out.println("COMPLETED");
		}
		//If the file is not found
		catch(FileNotFoundException e)a{
			System.out.println("FILE NOT FOUND");
		}
			
	}
}
