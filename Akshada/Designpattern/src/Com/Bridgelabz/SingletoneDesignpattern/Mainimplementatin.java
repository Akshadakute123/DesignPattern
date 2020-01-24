package Com.Bridgelabz.SingletoneDesignpattern;

public class Mainimplementatin
{
	public static void main(String[]args)
	{
		EagerInitialization.getInstance().show();
	//	System.out.println(EagerInitialization.getInstance().hashCode());
		//System.out.println(EagerInitialization.getInstance().);
		StaticBlockInitialization.getInstance().show();
	}
}
