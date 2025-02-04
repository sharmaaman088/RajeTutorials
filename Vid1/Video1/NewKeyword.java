package Video1;

public class NewKeyword {
	
	public void see() {
		System.out.println(" Hello See");
	}
	public void saw() {
		System.out.println(" Hello saw");
	}

	public static void main(String[] args) {
		NewKeyword ob = new NewKeyword();
		ob.saw();
		ob.see();//with just one object we could call all method

	}

}
