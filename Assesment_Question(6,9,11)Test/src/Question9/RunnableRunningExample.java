package Question9;

public class RunnableRunningExample {

	public static void main(String[] args) {

		try {

			ThreadOne thread1 = new ThreadOne();
			ThreadTwo thread2 = new ThreadTwo();
			ThreadThree thread3 = new ThreadThree();

			thread1.start();
			thread2.start();
			thread3.start();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

class ThreadOne extends Thread {

	public void run() {

		System.out.println("Thread 1 started ");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

			System.out.println("\nThread 1 completed");
		}
	}
}

class ThreadTwo extends Thread {

	public void run() {

		System.out.println("Thread 2 started ");

		for (int i = 40; i <= 60; i++) {
			System.out.print(i + " ");

			System.out.println("\nThread 2 completed");
		}
	}
}

class ThreadThree extends Thread {

	public void run() {

		System.out.println("Thread 3 started ");

		for (int i = 80; i <= 90; i++) {
			System.out.print(i + " ");

			System.out.println("\nThread 3 completed");
		}
	}
}
