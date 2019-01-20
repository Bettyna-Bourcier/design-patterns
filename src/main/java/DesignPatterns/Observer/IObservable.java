package DesignPatterns.Observer;

public interface IObservable {
	public void notifyObservers();
    public void subscribe(IObserver observer);
    public void unsubscribe(IObserver observer);
    public String getState();
    public void setState(String state);
}
