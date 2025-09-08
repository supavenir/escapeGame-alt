package escape.game.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import escape.game.entities.Enigme;

class EnigmeTest {
	
	private Enigme enigme1;
	private String bonneReponse;
	

	@BeforeEach
	void setUp() throws Exception {
		bonneReponse="Bonjour";		
		enigme1 = new Enigme("max", "tropbien",bonneReponse);
				
	}

	@Test
	void testResoudre() {
		assertFalse(enigme1.isResolu(),"Enigme initialialement non résolue");
		assertTrue(enigme1.resoudre("bonjour"),"La casse doit-être ignorée dans la comparaison");
		assertTrue(enigme1.isResolu());
		assertFalse(enigme1.resoudre("1515"));
		assertFalse(enigme1.isResolu());
		assertTrue(enigme1.resoudre(bonneReponse));
		assertTrue(enigme1.isResolu());
		assertFalse(enigme1.resoudre(null));
		assertFalse(enigme1.isResolu());
		
	}

}
