import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int number;
	
	System.out.print("정수를 입력하시오 : ");
	number = scn.nextInt();
	
	if(number % 2 == 0) {
		System.out.println("입력한 정수는 짝수 입니다.");
	}
	else {
		System.out.println("입력한 정수는 홀수입니다.");
	}
	}
}
