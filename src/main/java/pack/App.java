package pack;

public class App {

	public App() {
		System.out.println("DAB constructor...");
	}

	// Code de base

	public String extractFromDab(boolean c1, boolean c2, boolean c3) {
		String result = "";
		if (c1 && c2 && c3) {
			result = "Argent distribué";
		}
		if (c1 && !c2 && c3) {
			result = "Erreur plafond";
		}
		if (c1 && !c2 && !c3) {
			result = "Pas de solde";
		}
		return result;
	}
}