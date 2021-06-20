package homewrokMediator;

public class MediatorPatternExample {
	public static void main(String[] args) {
		User jordan = new User("Jordan");
		User aleksandur = new User("Aleksandur");
		jordan.sendMessage("Zdravei! Aleksandur");
		aleksandur.sendMessage("Zdrasti!Jordan");
		
	}

}
