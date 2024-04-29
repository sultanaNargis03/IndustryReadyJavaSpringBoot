class Flight
{
	
    public void takeOff()
    {
    	System.out.println("Flight is taking Off");
    }
    
    public void fly()
    {
    	System.out.println("Flight is flying ");
    }
   
}

class CargoFlight extends Flight
{
	public void takeOff()
    {
    	System.out.println("CargoFlight requires longer runway to  takeOff");
    }
    
    public void fly()
    {
    	System.out.println("CargoFlight flies at lower height");
    }
}


class PassengerFlight extends Flight
{
	public void takeOff()
    {
    	System.out.println("PassnegerFlight requires medium sized runway to  takeOff");
    }
    
    public void fly()
    {
    	System.out.println("PassenegrFlight flies at medium  height");
    }
}


class FighterFlight extends Flight
{
	public void takeOff()
    {
    	System.out.println("FighterFlight requires shorter sized runway to  takeOff");
    }
    
    public void fly()
    {
    	System.out.println("FighterFlight flies at high  height");
    }
}
public class LaunchPoly1 
{

	public static void main(String[] args) 
	{
		CargoFlight cf=new CargoFlight();
		
		PassengerFlight pf=new PassengerFlight();
		
		FighterFlight ff=new FighterFlight();
		
		Flight flight;
		
		flight=cf;// Flight flight=new CargoFlight();	
		
		
		flight.takeOff();
		flight.fly();
		
		System.out.println("                  ");
		
		flight=pf;//Flight flight=new PassengerFlight();
		
		flight.takeOff();
		flight.fly();
		
		System.out.println("                  ");
		
		flight=ff;
		
		flight.takeOff();
		flight.fly();

	}

}
