package DesignPatterns.Observer;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
    	IObserver observer = mock(ObserverImpl.class);
    	IObserver observer2 = mock(ObserverImpl.class);
        IObservable observable = new ObservableImpl();

        observable.subscribe(observer);
        observable.subscribe(observer2);
        
        observable.setState("changed");
        
        verify(observer).update();    
        verify(observer2).update();  
    }
}
