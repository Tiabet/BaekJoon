package Level1;
import java.util.*;

public class BaekJoon2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%5==0) {
			System.out.println(n/5);
		}
		else if((n-3)%5==0) {
			System.out.println((n-3)/5+1);
		} else if((n-6)%5==0&&(n-6)>=0) {
			System.out.println((n-6)/5+2);
		} else if((n-9)%5==0&&(n-9)>=0) {
			System.out.println((n-9)/5+3);
		} else if((n-12)%5==0&&(n-12)>=0) {
			System.out.println((n-12)/5+4);
		}else {
			System.out.println(-1);
		}
		

	}

}
