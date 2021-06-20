package homeworkObserver;

public class View2 implements Observer {
	
	private Worker worker;

    public View2(Worker s1) {
        this.worker = s1;
    }

    public void update() {
        System.out.println("View1:" + worker.getId());
    }

	public void update1() {
		// TODO Auto-generated method stub

	}

}
