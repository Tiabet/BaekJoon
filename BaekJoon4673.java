package Level1;
public class BaekJoon4673 {

	public static void main(String[] args) {
		boolean[] a = new boolean[10001];
		a[0]=true;
		
		for (int i=1;i<=a.length;i++) {
			a[i]=false;
			for (int n=1;n<a.length;n++) {
				Integer num=n;
				String s = num.toString();
				String[] srr=s.split("");
				
				for(int j=1;j<=s.length();j++) {
					int[] arr = new int[s.length()] ;
					arr[j-1]=Integer.parseInt(srr[j-1]);
					int val=n+arr[j-1];
					if(i==val) {
						a[i]=true;
				}
				}
				
			}
			if (a[i]==false) {
				System.out.println(i);
			}
		}
		
		
	}

}
