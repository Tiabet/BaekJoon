package Level1;
import java.util.*;

public class BaekJoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int a_new=d(a);
		int b_new=d(b);
		
		if(a_new>b_new) {
			System.out.println(a_new);
		} else {
			System.out.println(b_new);
		}

	}
	
	public static int d(int n) {
		int n_1 = n%10;
		int n_10 = (n/10)%10;
		int n_100=n/100;
		
		int n_new=(n_1)*100+n_10*10+n_100;
		return n_new;
	}

}
