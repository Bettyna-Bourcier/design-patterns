package DesignPatterns.Observer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IObserver observer = new ObserverImpl();
        IObservable observable = new ObservableImpl();

        observable.subscribe(observer);
        observable.setState("changed");
    }
}
