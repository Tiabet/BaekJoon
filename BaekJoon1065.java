package Level1;
import java.util.*;

public class BaekJoon1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hansu=0;
		if(n<100) {
			System.out.println(n);
		} else if(n>=100) {
			hansu=99;
			for(int i=101;i<=n;i++) {
			int i_1 = i/100;
			int i_2 = (i/10)%10;
			int i_3 = i%10;
			if(i_1-i_2==i_2-i_3) {
				hansu++;
			}
			
			}
			System.out.println(hansu);
		}

	}
	

}
