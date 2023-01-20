package Level1;
import java.util.*;
public class BaekJoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int m =sc.nextInt();
		int rm=m-45;
		
		
		if(rm>=0) {
			System.out.println(h+" "+(m-45));
		} else {
			if(h>0) {
			System.out.println((h-1)+" "+(60+rm));
			} else {
				System.out.println(23+" "+(60+rm));
			}
		}

	}

}	
