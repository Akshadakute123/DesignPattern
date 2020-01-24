package Com.Bridgelabz.SingletoneDesignpattern;
//throw new Runt("Exception occured in creating singleton instance");

public class LazyInitialization{

    private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    public LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}