package Level2;

import java.util.*;
import java.io.*;



public class B2751 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		
		for(int i =0; i<a;i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		
		
		Collections.sort(list);
		
		for (Integer i : list) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);

	}

}
