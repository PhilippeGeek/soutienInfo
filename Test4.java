public class Test4 {
	public static void main(String[] args) {
		final int x = 5, y = 47;
		//Random entier entre x et y;
		
		System.out.println((int)(Math.random()*(Math.abs(x-y)) + x));
	}
}
