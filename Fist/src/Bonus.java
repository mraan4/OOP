import java.util.Scanner;

public class Bonus {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	final int TARGETSALES = 1000;
	int mySales, bonus;
	String result;
	
	System.out.print("������ �Է����ּ���(���� ����) : ");
	mySales = scn.nextInt();
	
	if(mySales - TARGETSALES > 0) {
		result = "���� �޼�";
		bonus = (mySales - TARGETSALES) / 10;
	}
	else {
		result = "���� �޼� ����";
		bonus = 0;
	}
	System.out.println(result + "���ʽ� = " + bonus);
}
}
