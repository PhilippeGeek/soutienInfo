public class Test5 {
	public static void main(String[] args) {
		System.out.println(estMaj('A'));
		System.out.println(estMaj('h'));
		System.out.println(estMaj2('A'));
		System.out.println(estMaj2('h'));
	}
	public static boolean estMaj(char c) {
		if (c >= 'A' && c <= 'Z')
			return true;
		return false;
	}
	public static boolean estMaj2(char c) {
		return (c >= 'A' && c <= 'Z');
	}
}
