package Level2;

import java.util.Scanner;

public class B14425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count=0;
		
		String[] S1 = new String[n];
		String[] S2 = new String[m];
		for(int i=0;i<n;i++) {
			S1[i]=sc.next();
		}
		for(int j=0;j<m;j++) {
			S2[j]=sc.next();
		}
		
		for(String str1 : S1) {
			for (String str2 : S2) {
				if(str1.equals(str2)) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
