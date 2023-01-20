package Level1;
import java.util.*;

public class BaekJoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a[]=new double[n];
		
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		double max = 0;
		for (int i=0;i<n;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		
		
		
		double sum = 0;
		for (int i=0;i<n;i++) {
			a[i]=(a[i]/max*100);
			sum+=a[i];
		}
		double avg=sum/n;
		System.out.println(avg);
		

	}

}
