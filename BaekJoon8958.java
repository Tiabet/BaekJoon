package Level1;
	import java.util.*;
	
	public class BaekJoon8958 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String[] srr = new String[n];
			for(int i=0;i<n;i++) {
				
				srr[i]=sc.next();
			}
			sc.close();
			for(int i=0;i<srr.length;i++) {
				int count=0;
				int sum=0;
			
				for(int j=0;j<srr[i].length();j++) {
					if(srr[i].charAt(j)=='O') {
						count++;
					} else{
						count=0;
					}
					sum+=count;
					
				}
				System.out.println(sum);
			}
		}
	}
	
	
