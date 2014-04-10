public class Test3 {
	public static void main(String[] args) {
		String s = "Toto est à la pl4ge";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o')
				res += '4';
			else
				res += s.charAt(i);
		}
		System.out.println(s);
		System.out.println(res);
	}
}
