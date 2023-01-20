package Level1;
import java.util.*;

public class BaekJoon2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<=4;i++) {
			num[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<5;j++) {
			sum+=num[j]*num[j];
			
		}
		System.out.println(sum%10);

	}
}
