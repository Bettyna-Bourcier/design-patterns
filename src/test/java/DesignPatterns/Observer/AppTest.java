package DesignPatterns.Observer;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testObserversUpdate()
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
    
    public void testObserversUnsubscribe()
    {
    	IObserver observer = mock(ObserverImpl.class);
    	IObserver observer2 = mock(ObserverImpl.class);
        IObservable observable = new ObservableImpl();

        observable.subscribe(observer);
        observable.subscribe(observer2);
        
        observable.setState("changed");
        
        observable.unsubscribe(observer);
        observable.unsubscribe(observer2);
        
        observable.setState("changed");
        
        verify(observer, times(1)).update();    
        verify(observer2, times(1)).update();  
    }
}
