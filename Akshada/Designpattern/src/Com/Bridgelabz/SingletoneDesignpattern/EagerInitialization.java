package Com.Bridgelabz.SingletoneDesignpattern;

public class EagerInitialization 
{ 
	private static final EagerInitialization instance=new EagerInitialization();
	private  EagerInitialization()
	{}
	public static EagerInitialization getInstance()
	{
		
		return instance;
		
	}
	public void show()
	{
		System.out.println("eager singletone created");
	}
	
	}	

