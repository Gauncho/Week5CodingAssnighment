package Logger;

public class AsteriskLogger implements Logger{
	String Name;
	
	
	
	

	public void Log(String Name) {
		// TODO Authis.Name = Name;
		this.Name = Name;
		System.out.println("***" + Name + "***");
		
	}


	public void Error(String Name) {
		// TODO Auto-generated method stub
		this.Name = Name;
		int x = Name.length();
		for (int i = 0; i < x + 13; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***"+ "Error: " + Name + "***");
		for (int i = 0; i < x +13; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
