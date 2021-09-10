import java.util.Scanner;

public class GetMin {
	public static void main(String[] args) {
		//int s[] = {12,3,19,6,8,4,5,1,6,10};
		int s[] = new int[10];
		Scanner scn = new Scanner(System.in);
		int mininum,maxnum;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print("10개 중에 " + (i+1) + "번째 수 입력 : ");
			s[i] = scn.nextInt();
		}
		mininum = s[0];
		maxnum = s[0];
		
		for (int i = 1; i < s.length; i++) {
			if(mininum > s[i]) 
				mininum = s[i];
			if(maxnum < s[i])
				maxnum = s[i];
		}
		System.out.println("최소값 = " + mininum + ", 최대값 = " + maxnum);
	}
}
