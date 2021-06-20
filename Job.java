package homeworkObserver;
	
	import java.util.LinkedList;
	import java.util.List;

	public abstract class Job {
	    private List<Observer> observers = new LinkedList<Observer>();

	    protected void notifyObserver() {
	        for (int i = 0; i < observers.size(); i++) {
				Observer.update();
			}
	    }

	    public void register(Observer o) {
	        observers.add(o);
	    }

	    public void remove(Observer o) {
	        observers.remove(o);
	    }
	}


