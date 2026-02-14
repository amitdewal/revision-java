package tutorial_points;

public class RunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String name) {
		threadName = name;
		System.out.println("creating  "+ threadName);
	}

	@Override
	public void run() {
		
		try {
			
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread : "+ threadName+" interrupted.");
				
			}
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Thread : "+ threadName+" interrupted.");
		}
		System.out.println("Thread : "+ threadName+" exiting.");
	}
	
	public void start() {
		System.out.println("starting "+ threadName);
		
		if( t == null) {
			t  = new Thread(this, threadName);
			t.start();
		}
		
	}

}
