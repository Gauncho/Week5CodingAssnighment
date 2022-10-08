package Logger;

public class SpacedLogger implements Logger{

	String Name;
	
	
	public void Log(String Name) {
		System.out.println(Name.replace("", " "));
	}
	public void Error(String Name) {
		System.out.println("ERROR:" + Name.replace("", " "));
		
	}
}
