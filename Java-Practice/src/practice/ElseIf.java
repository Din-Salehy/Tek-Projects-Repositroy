package practice;

import java.time.LocalDate;

public class ElseIf {

	public static void main(String[] args) {
		
		
		LocalDate todayDate = LocalDate.now();
		int month = todayDate.getMonthValue();
		
		if (month == 3 || month == 4 ||  month ==5 )
		{
			System.out.println("It is Spring");
		}
		
		else if (month == 7 || month == 8 || month ==9)
		{
			System.out.println("It is Summer");
		}
		
	}
}
