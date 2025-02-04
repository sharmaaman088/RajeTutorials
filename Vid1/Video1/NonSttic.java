package Video1;

public class NonSttic {
	
	
	String  s ="Aman";
	public static void main(String[] args) {
		Am obj = new Am();
		obj.add(12, 254, 45);
		System.out.println(obj.fl);
		System.out.println(Am.ss);
		
		NonSttic o = new NonSttic();
		System.out.println(o.s);
		
	}

}

class Am{
	static String ss="Sharma";
	float fl =2.23f;
	public void add (int v,int v2,int v3) {
	System.out.println(v+v2+v3);
}
}