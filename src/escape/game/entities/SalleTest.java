package escape.game.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalleTest {
	
	private Salle salle;

	@BeforeEach
	void setUp() throws Exception {
		salle=new Salle("C11", 30);
	}

	@Test
	void testAjouterEnigme() {
		assertEquals(0, salle.getEnigmes().size());
		Enigme e=new Enigme("François", "Marignan ?", "1515");
		salle.ajouterEnigme(e);
		assertEquals(1, salle.getEnigmes().size());
	}

	@Test
	void testIsTerminee() {
		assertTrue(salle.isTerminee());
		
		Enigme e=new Enigme("François", "Marignan ?", "1515");
		salle.ajouterEnigme(e);
		
		salle.resoudreEnigme(0, "pas 1515");
		assertFalse(salle.isTerminee());
		salle.resoudreEnigme(0, "1515");
		assertTrue(salle.isTerminee());
	}


}
