
import java.time.*;
public class LaunchDateTime2 
{

	public static void main(String[] args) 
	{
		//LocalDate date=new LocalDate();
		
		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		
		int dayOfMonth=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.println("Date : "+ dayOfMonth + " / "+ month + " / "+ year);
		
		System.out.println("Day of this year : "+ date.getDayOfYear());
		
		System.out.println("**************************************");
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int hour=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nano=time.getNano();
		
		System.out.println(hour + " : "+ min + " : "+ sec + " : "+ nano);

	}

}
