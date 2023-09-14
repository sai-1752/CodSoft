import java.util.Scanner;

public class GradeMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO CODESOFT GRADE SYSTEM");

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER YOUR NAME:");// ENTER YOUR NAME IN CAPITAL LETTERS
		String name = sc.next();

		System.out.println("ENTER THE NO.OF SUBJECTS:");
		int totalSubjects = sc.nextInt();
		int[] marks = new int[totalSubjects];

		System.out.println("Enter marks obtained in each subject (out of 100):");
		for (int i = 0; i < totalSubjects; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
		}


		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}


		double averagePercentage = ((double) totalMarks / (totalSubjects * 100)) * 100;

		char grade;
		if (averagePercentage >= 90) {
			grade = 'O';
		} else if (averagePercentage >= 80) {
			grade = 'A';
		} else if (averagePercentage >= 70) {
			grade = 'B';
		} else if (averagePercentage >= 60) {
			grade = 'C';
		} else {
			grade = 'F';
		}


		System.out.println("\nResults:");

		System.out.println("Total Marks: " + totalMarks);

		System.out.println("Average Percentage: " + averagePercentage + "%");

		System.out.println("Grade: " + grade);

		System.out.println("THANK YOU FOR CALCULATING YOUR MARKS" + " " + name);


		sc.close();

	}

}
