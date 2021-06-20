package homeworkObserver;

public class View3 {
	
	private Worker worker;


    public View3(Worker s1) {
        this.worker = s1;
    }

    public void change() {
        worker.setId(2);
    }

}
