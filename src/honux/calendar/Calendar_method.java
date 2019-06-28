package honux.calendar;
import java.util.Scanner;


public class Calendar_method {
	
	private static final int[] Max_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //int[] 배열타입이라는 의미 
	
	public int getMaxDaysOfMonth(int month) {

		return Max_DAYS[month - 1];		
	}

	public static void main(String[] args) {
		

		//숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar_method cal = new Calendar_method();
		
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		
		scanner.close();
	}

}
