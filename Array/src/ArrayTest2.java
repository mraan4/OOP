import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int STUDENT_NUMBER = 5;
		int total = 0;
		int[] scores = new int[STUDENT_NUMBER];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�л��� ���� �Է� : ");
			scores[i] = scn.nextInt(); 
		}
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("��� ������ : " + (double)total/STUDENT_NUMBER + "�Դϴ�.");
	}
}
