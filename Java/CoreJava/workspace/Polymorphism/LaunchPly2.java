abstract class Flight1
{
	
    abstract public void takeOff();
    
    abstract public void fly();
    
    public void landing()
    {
    	System.out.println("AT the end flight needs to land or else passenegr will panic");
    }
   
}

class CargoFlight1 extends Flight1
{
//	public CargoFlight1()
//	{
//		super();
//	}
	public void takeOff()
    {
    	System.out.println("CargoFlight requires longer runway to  takeOff");
    }
	 //abstract public void takeOff();
    public void fly()
    {
    	System.out.println("CargoFlight flies at lower height");
    }
}


class PassengerFlight1 extends Flight1
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

class FighterFlight1 extends Flight1
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
class Airport
{
	public void permit(Flight1 flight)//Flight flight =new CargoFlight();
	{
		flight.takeOff();
		flight.fly();
		
	}
}
public class LaunchPly2 
{
	public static void main(String[] args) 
	{
		CargoFlight1 cf=new CargoFlight1();
		
		PassengerFlight1 pf=new PassengerFlight1();
		
		FighterFlight1 ff=new FighterFlight1();
		
		Airport a=new Airport();
		
		a.permit(cf);
		a.permit(pf);
		a.permit(ff);
		
	//Flight1	f=new Flight1(); 

	}

}
