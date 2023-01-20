package Level1;

import java.util.Scanner;

public class BaekJoon11720 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String s = sc.next();
			int[] arr = new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				arr[i]=s.charAt(i);
				sum+=arr[i]-48;
			}
			System.out.println(sum);

	}

}
