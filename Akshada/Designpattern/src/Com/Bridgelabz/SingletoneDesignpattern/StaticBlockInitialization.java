package Com.Bridgelabz.SingletoneDesignpattern;

public  class StaticBlockInitialization
{
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization()
	{}
	static
	{//throw new RuntimeException("Exception occured in creating singleton instance");
try {
            instance = new StaticBlockInitialization();
       
	}catch(Exception e) {
		throw new RuntimeException("Exception occured in creating singleton instance");
	}
	}
    public static StaticBlockInitialization getInstance()
    {
        return instance;
    }
    public void show()
	{
    	
		System.out.println("static block singletone created");
		//throw new Runt("Exception occured in creating singleton instance");
	}
}
	


