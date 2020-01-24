package Com.Bridgelabz.SingletoneDesignpattern;


	

	import java.io.Serializable;

	public class SerializedSingleton implements Serializable{

	    

	    private SerializedSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final Serializedmain instance = new Serializedmain();
	    }
	    
	    public static Serializedmain getInstance(){
	        return SingletonHelper.instance;
	    }
	    
	}



