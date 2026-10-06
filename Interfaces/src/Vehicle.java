
public interface Vehicle {
	
	public static final int no=10;
	
	public default void stop() {
		System.out.println("Stop the vehicle");
	}
	
	public abstract void start();
//	{ if we try to create blocks or constructors inside interfaces it will directly throws CTE
//		
//	}
	
	public static void playMusic() {
		System.out.println("u r my Hanggggover,MounaRaagangal,......");
	}
}
