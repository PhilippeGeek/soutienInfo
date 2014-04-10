public class Test7 {
	public static void main(String[] args) {
		final int N = 5;
		final int T = 8;
		char[][] charTab = new char[N][T];
		
		System.out.println("\n==== On exécute le programme " + N + " fois avec des chaines de " + T + " caractères ====\n");
		
		// On l'éxécute N fois (Alban)
		for (int n = 0; n < N; n++) {
			char[] t = new char[T];
		
			// On remplit le tableau
			for (int i = 0; i < charTab[n].length; i++)
				charTab[n][i] = generateLetter();

			String s = "";
		
			// On le passe en String (modifié pour Martin)
			for (int i = 0; i < charTab[n].length; i++) {
				if (charTab[n][i] != 'o')
					s += charTab[n][i];
				else
					s += 'a';
			}

			// On affiche la chaine
			System.out.println(s);
		
			String retourne = "";
			// On retourne la chaine
			for (int i = 0; i < charTab[n].length; i++)
				retourne += s.charAt(s.length()-i-1);	
		
			// On affiche la chaine retournée et sa première moitié
			System.out.println(retourne);
			System.out.println(retourne.substring(0,s.length()/2));
			
			if (!(n == N-1))
				System.out.println("***** Fin d'exécution n° " + (n+1) + " *****\n");
			else
				System.out.println("***** Fin d'exécution n° " + (n+1) + " *****");
		}
	}



	public static char generateLetter() {
		if (Math.random() >= 0.5)
			return (char)((int)(Math.random()*(Math.abs('a'-'z')) + 'a'));
		return (char)((int)(Math.random()*(Math.abs('A'-'Z')) + 'A'));
	}
}
