import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int number;
	
	System.out.print("������ �Է��Ͻÿ� : ");
	number = scn.nextInt();
	
	if(number % 2 == 0) {
		System.out.println("�Է��� ������ ¦�� �Դϴ�.");
	}
	else {
		System.out.println("�Է��� ������ Ȧ���Դϴ�.");
	}
	}
}
