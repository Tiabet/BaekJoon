package Level1;
import java.util.*;

public class BaekJoon3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[10];
		int count = arr.length;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt()%42;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count-=1;
					arr[j]=-1;
				 }
				}
			}
		System.out.println(count);
		}
}