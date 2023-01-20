package Level1;

import java.util.Scanner;

public class BaekJoon1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n =sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt()%4;
			
			a=a%10;
			if(a==0) {
				a=10;
			}
			if(b==0) {
				b=4;
			}
			
			int data=(int) Math.pow(a, b);
			
			data=data%10;
			if(data==0) {
				data=10;
			}
			System.out.println(data);
			
		}
	}

}
