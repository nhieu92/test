package test;

public class Counter {
	private static int count = 0;
	
	public static int getInstanceNum() {
		return count;
	}
	
	static {
		count = 10;
	}
	
	public Counter(int a) {
		count = a;
	}
	
	public class Note {
		public Note() {
			
		}
	}
	
	public void show() {
		
	}
}
