//class CargoPlane extends FighterPlane
//{
//	
//}
//
//class FighterPlane extends CargoPlane
//{
//	
//} cyclic inheritance is not allowed

class AeroPlane
{
	AeroPlane()
	{
		System.out.println("AeroPlane constructor");
	}
}

class CargoPlane extends AeroPlane
{
	CargoPlane()
	{
		//super();
	}
}


public class LaunchInh3 
{

	public static void main(String[] args) 
	{
		CargoPlane cargo=new CargoPlane();
	}

}
