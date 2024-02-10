package sttudenntgradecalculator;
import java.util.Scanner;
public class StudentGradecalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total no.of Subjects");
		int m = sc.nextInt();
		int tot = 0;
		float Aver = 0;
		int Mark = m * 100;
		System.out.println("Enter the Marks obtained (out of 100)");
		for(int i=1; i<=m; i++) {
			int n = sc.nextInt();
			if (n > 100) {
				System.out.println("Given number exceeds the marks");
				break;
			}
			else {
				tot += n;
				
			}
		}
		System.out.println("Total Marks obtained : " + tot);
		Aver = ((float) tot/Mark) * 100;
		System.out.println("Total Average obtained : " + Aver);
		System.out.print("Grade Obtained : ");
		if(Aver >= 90) {
			System.out.print("A Grade");
		}
		else if (Aver < 90 & Aver >= 80) {
			System.out.print("B Grade");
		}
		else if (Aver < 80 & Aver >= 70) {
			System.out.print("C Grade");
		}
		else if (Aver < 70 & Aver >= 60) {
			System.out.print("C Grade");
		}
		else if (Aver < 60 & Aver >= 50) {
			System.out.print("E Grade");
		}
		else if (Aver < 50 & Aver >= 40) {
			System.out.print("F Grade");
		}
		else  {
			System.out.print("G Grade");
		}
		

	}

}
