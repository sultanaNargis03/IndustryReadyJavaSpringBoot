interface IGen<T>
{
	void disp();
}
class Human1 
{
	public void sleep()
	{
		System.out.println("Human needs to sleep");
	}
}

class Genr<T> implements IGen<String>
{
	T ref;
	
	public T getRef() {
		return ref;
	}
	public Genr(T ref)
	{
		this.ref=ref;
	}
	public void disp()
	{
		System.out.println("The type passed to generic<T> : " + 
	ref.getClass().getName());
	}	
}
public class LaunchGen2 
{

	public static void main(String[] args) 
	{
		
//		Genr<Integer> gen=new Genr<>(44);
		
		Genr<Integer> gen=new Genr<>(44);
		gen.disp();
		System.out.println("Details through getter : "+ gen.getRef());
		System.out.println("********************************");
		Genr<String> gen2=new Genr<>("Java");
		gen2.disp();
		System.out.println("Details through getter : "+ gen2.getRef());
		System.out.println("********************************");
		Genr<Human1> gen3=new Genr<>(new Human1());
		gen3.disp();
		System.out.println("Details through getter : "+ gen3.getRef());
		System.out.println("********************************");
		IGen<String> g=new Genr<>("Java is best");
		g.disp();
		//System.out.println("Details through getter : "+ g.getRef());
		System.out.println("********************************");
		
		
	}

}
