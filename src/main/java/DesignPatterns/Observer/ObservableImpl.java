package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObservable {
    List<IObserver> observers = new ArrayList<IObserver>();
    
    String state = "";

    public void notifyObservers() {
    	for(IObserver observer : observers) {
    		observer.update();
    	}
    }

    public void subscribe(IObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyObservers();
	}
    
}
