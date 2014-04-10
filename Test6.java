public class Test6 {
	public static void main(String[] args) {
		int[] t1 = {1,3,5,7};
		char[] t2 = new char[4];
		
		t2[0] = 'T';
		t2[1] = '0';
		t2[2] = 't';
		t2[3] = '0';

		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i] + " => " + t2[i]);
		}

		System.out.println("");

		afficheTableau(t1);
		System.out.println("");

		afficheTableau(t2);
		System.out.println("");
	}

	public static void afficheTableau(int[] t) {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}


	public static void afficheTableau(char[] t) {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
