package Level1;
import java.util.Scanner;

public class BaekJoon1157 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine().toUpperCase();
		int max=0;
		int many=0;
		
		
		int a[]=new int[26];
		
		for (int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			
			if(ch>='A') {
				a[ch-'A']+=1;
			}
		}
		
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				many=i;
				max=a[i];
			}
			else if(a[i]==max) {
				many='?';
			}
		}
		if(many!='?') {
			System.out.println((char)(many+65));
		
		}else {
			System.out.println((char)many);
		}
		
	}

}
