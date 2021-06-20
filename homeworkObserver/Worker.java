package homeworkObserver;

public class Worker {
	
	private int id;
    private String name;
   

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
       
    }

    public void setId(int id) {
        this.id = id;
        notifyObserver();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    private void notifyObserver() {
		// TODO Auto-generated method stub
		
    }


	public void reg(Observer o1) {
		// TODO Auto-generated method stub
		
	}

	public void register(Observer o2) {
		// TODO Auto-generated method stub
		
	}

}
