package DesignPatterns.Singleton;

public class SingletonManager {
	
	private static SingletonManager singletonManager;
	
	public static SingletonManager getInstance() {
		if(singletonManager == null) {
			return singletonManager = new SingletonManager();
		}
		return singletonManager;
	}

}
