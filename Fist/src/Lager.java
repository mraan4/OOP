import java.util.Scanner;

public class Lager {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int x, y, max;
	
	System.out.print("ù ��° ���� : ");
	x = scn.nextInt();
	System.out.print("�� ��° ���� : ");
	y = scn.nextInt();
	
//	if(x>y) {
//		max = x;
//	}
//	else {
//		max = y;
//	}
	
	max = (x > y)?x:y;
	System.out.println("ū ���� " + max);
}
}
