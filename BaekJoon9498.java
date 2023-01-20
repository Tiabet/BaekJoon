package Level1;
import java.util.*;

public class BaekJoon9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";
		if(score>=90) {
			grade="A";
		}else if(score>=80&&score<=89) {
			grade="B";
		}else if(score>=70&&score<=79) {
			grade="C";
			
		}else if(score>=60&&score<=69) {
			grade="D";
		}else {
			grade="F";
		}
		
		System.out.println(grade);
				

	}

}
