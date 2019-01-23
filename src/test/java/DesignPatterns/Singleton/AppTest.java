package DesignPatterns.Singleton;


import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testSingletonManagerInstance()
    {
    	SingletonManager singletonManager = SingletonManager.getInstance();
    	SingletonManager singletonManager2 = SingletonManager.getInstance();
    	assertSame("should be same", singletonManager, singletonManager2);
    }
    
}
