package homeworkObserver;

public class View1 implements Observer {
	
	private Worker worker;

    public View1(Worker s1) {
        this.worker = s1;
    }

    public void update() {
        System.out.println("View1:" + worker.getId() + worker.getName());
    }

	public void update1() {
		// TODO Auto-generated method stub

	}

}
