package sample.stringarray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Test test = new Test();
		long result = test.fib(50);
		System.out.println("result: " + result);
		System.out.println(System.currentTimeMillis() - start);
	}

	public int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
