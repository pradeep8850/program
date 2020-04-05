package Deep;

public class Fan {
	String name;
	byte pankh;
	int price;
	public static void main(String[] args) {
		Fan f=new Fan();
		String a = f.name="abc";
		byte b=f.pankh=3;
		int c=f.price=500;
		System.out.println(a+b+c);
	}	
}
