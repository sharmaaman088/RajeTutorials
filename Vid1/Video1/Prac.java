package Video1;

public class Prac {
public boolean show(int a, int b) {
	if (a+b == 32) {
	return true;
	}
	
	else
    return false;        // Returns false if a + b does not equal 31
}


public static void main(String[] args) {
	Prac obj = new Prac();
	boolean res = obj.show(15, 16);
	System.out.println(res);
}
	
}
