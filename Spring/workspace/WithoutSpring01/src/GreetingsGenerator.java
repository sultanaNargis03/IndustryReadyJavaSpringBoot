import java.util.Date;

//Target class
public class GreetingsGenerator 
{
	
	private Date date;

	public GreetingsGenerator() 
	{
		System.out.println("GG is instantiated");
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	//Business logic
	public String generateGreeting(String name)
	{
		int hour=date.getHours();
		
		if(hour<12)
			return "Good Morning!"+name;
		else if(hour<16)
			return "Good Afternoon!"+name;
		else if(hour<20)
			return "Good Evening!"+name;
		else 
			return "Good Night!"+name;

	}

	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}
	
	
}
