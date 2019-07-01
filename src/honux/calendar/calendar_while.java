package honux.calendar;
import java.util.Scanner;


public class calendar_while {
	
	private static final int[] Max_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //int[] 배열타입이라는 의미 
	
	public int getMaxDaysOfMonth(int month) {

		return Max_DAYS[month - 1];		
		
	}
public static void main(String[] args) {
		

		//숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
	
		String PROMPT = "cal> " ;
		Scanner scanner = new Scanner(System.in);
		calendar_while cal = new  calendar_while();
		
		int month = 1;
		
		while(true) {
		System.out.println("달을 입력하세요");
		System.out.print(PROMPT);
		month= scanner.nextInt();
		
		if(month == -1) {
			break;
		}
				
		if (month > 12) {
			continue;
		}
			
	
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
			
		}		
		
			System.out.println("\n반복이 완료되었습니다. ^^ ");
			scanner.close();
	}

}



