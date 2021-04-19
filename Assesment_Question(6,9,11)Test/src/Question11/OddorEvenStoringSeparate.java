package Question11;

public class OddorEvenStoringSeparate {
	public static void main(String[] args) {

		int a[] = new int[6];

		a[0] = 10;// initialization
		a[1] = 22;
		a[2] = 77;
		a[3] = 44;
		a[4] = 55;
		a[5] = 63;

		for (int i = 0; i < a.length; i++)// length is the property of array
			if (a[i] % 2 == 0) {
				int j = a[i];
				System.out.println("Even Numbers Are:" + j);
			} else {
				int k = a[i];
				System.out.println("Odd Numbers Are :" + k);
			}
		{

		}
	}
}
