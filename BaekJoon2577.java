package Level1;
import java.util.*;

public class BaekJoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Integer num = a*b*c;
		String numstr=num.toString();
		
		int[] arr=new int[10];
		
		for(int i=0;i<numstr.length();i++) {
			char ch = numstr.charAt(i);
			arr[ch-48]+=1;
		
		}
		for(int data:arr) {
			System.out.println(data);
		}
		

	}

}
