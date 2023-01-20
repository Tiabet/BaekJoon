package Level1;

import java.util.Scanner;
public class BaekJoon1152 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String[] splitArray=text.split(" ");
		int len = splitArray.length;
		for(int i=0;i<splitArray.length;i++) {
			if(splitArray[i].equals("1")) {
				len-=1;
			}
		}
	
		
		System.out.println(len);

	}

}
