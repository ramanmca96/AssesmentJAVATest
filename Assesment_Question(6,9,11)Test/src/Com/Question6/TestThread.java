package Com.Question6;

public class TestThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Entering run method");
		for (int i = 0; i < 3; i++) {
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Value - " + i);
			if (i == 1) {
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		TestThread obj = new TestThread();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		// long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
	}
}