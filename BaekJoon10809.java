package Level1;
import java.util.Scanner;

public class BaekJoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int [] alpha = new int[26];
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=-1;
			
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(alpha[ch-97]!=-1) {
				continue;
			}
			alpha[ch-97]=i;
			
		}
		for(int i =0;i<alpha.length;i++) {
			System.out.print(alpha[i]);
			System.out.print(" ");
		}
	}

}
