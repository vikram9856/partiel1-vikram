package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RibTest {

	@Test
	void shouldContructRib() {
		assertDoesNotThrow(() -> {
			new Rib("30002","00550", "0000157841Z","25");
		});
	}

}
