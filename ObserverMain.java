package homeworkObserver;

public class ObserverMain {
	
	public static void main(String[] args) {
	
	Worker s1 = new Worker(1, "A");

    Observer o1 = new View1(s1);
    Observer o2 = new View2(s1);
		s1.reg(o1);
		s1.register(o2);


    View3 v = new View3(s1);
		v.change();
	}

}
