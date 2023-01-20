package Level2;

import java.util.Scanner;

public class B2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int [][] apart = new int [15][14];
		int[] people = new int[num1];
		for(int i =0;i<14;i++) {
			apart[0][i]=i+1;
		}
		for(int i = 1;i<15;i++) {
			for(int j=0;j<14;j++) {
				for(int k=0;k<=j;k++) {
					apart[i][j]+=apart[i-1][k];
				}
				
			}
		}
		
		for(int i = 0 ;i<num1;i++) {
			int floor = sc.nextInt();
			int ho = sc.nextInt();
			people[i]=apart[floor][ho-1];
		}
		
		for(int i:people) {
			System.out.println(i);
		}
	}

}
