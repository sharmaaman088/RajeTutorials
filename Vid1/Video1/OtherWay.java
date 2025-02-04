package Video1;
//other way to create and print object 
//but that prevents  
public class OtherWay {
	double dbl =26.2;
	
	public void show() {
		System.out.println("See");
	}
	
	public void disp() {
		System.out.println("SAW");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(new OtherWay().dbl);
		new OtherWay().show();
		new OtherWay().disp();
	}
	
}
