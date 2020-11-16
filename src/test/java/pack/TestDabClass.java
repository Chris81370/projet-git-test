package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDabClass {

	@Test
	public void allTrue() {
		App app = new App();
		boolean c1 = true;
		boolean c2 = true;
		boolean c3 = true;
		String errorMessage = app.extractFromDab(c1, c2, c3);
		assertEquals("Argent distribué", errorMessage);
	}

	@Test
	public void ceilingError() {
		App app = new App();
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = true;
		String errorMessage = app.extractFromDab(c1, c2, c3);
		assertEquals("Erreur plafond", errorMessage);
	}

	@Test
	public void outSold() {
		App app = new App();
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = false;
		String errorMessage = app.extractFromDab(c1, c2, c3);
		assertEquals("Pas de solde", errorMessage);
	}

}
