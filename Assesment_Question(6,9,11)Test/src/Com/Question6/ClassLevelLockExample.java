package Com.Question6;

public class ClassLevelLockExample implements Runnable {

	@Override
	public void run() {
		classLock();
	}

	public void classLock() {
		System.out.println(Thread.currentThread().getName());
		synchronized (ClassLevelLockExample.class) {
			System.out.println("Synchronized block " + Thread.currentThread().getName());
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " end");
		}
	}

	public static void main(String[] args) {
		ClassLevelLockExample test1 = new ClassLevelLockExample();
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		ClassLevelLockExample test2 = new ClassLevelLockExample();
		Thread t3 = new Thread(test2);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
