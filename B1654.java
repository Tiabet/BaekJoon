package Level2;

import java.util.Scanner;

public class B1654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int have = sc.nextInt();
		int need = sc.nextInt();
		int[] arr = new int[have];
		for(int i=0;i<have;i++) {
			arr[i]=sc.nextInt();
		}
		
		int n=1;
		int get=0;
		while(true) {
			for(int i=0;i<arr.length;i++) {
				get+=arr[i]/n;
			}
			if(get>need||get==need) {
				get=0;
				n++;
			}
			else if(get<need) {
				break;
			}
			
		}
		System.out.println(n-1);
		
		

	}

}
