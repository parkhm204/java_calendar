package honux.calendar;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		
		int a,b;
		
		System.out.println("덧셈을 원하는 두개의 숫자를 입력해주세요. ");
		Scanner scanner = new Scanner(System.in); //System.in 키보드입력이라는 의미
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.println("두수의 합은 " + (a + b) + " 입니다." );
		System.out.printf("%d와 %d의 합은 %d입니다. ",a, b, a + b );
		scanner.close();
	}
}
