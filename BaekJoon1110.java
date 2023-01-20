package Level1;

import java.util.Scanner;

public class BaekJoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2];
		arr[0]=n/10;
		arr[1]=n%10;
		int  newnum=arr[1]*10+(arr[0]+arr[1])%10;
		int count=1;
		while(n!=newnum) {
			arr[0]=newnum/10;
			arr[1]=newnum%10;
			newnum=arr[1]*10+(arr[0]+arr[1])%10;
			count++;
		}
		System.out.println(count);

	}

} 