package Level1;
import java.util.*;

public class BaekJoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max=0;
		int maxnum=0;
		for(int  i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			if(num[i]>max) {
				max=num[i];
				maxnum=i+1;
			}
		}		
		System.out.println(max);
		System.out.println(maxnum);

	}

}
