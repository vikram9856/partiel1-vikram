package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IbanTest {

	@Test
	void testcodePaysStandardIsoIsNotNull() {
		assertNotNull(() -> {
			new CodePaysStandartIso("FR");
		});

		
		
	}
	
	@Test
	void testcleDeControlIsNotNull() {
		assertNotNull(() -> {
			new cleDeControl();
		});
	}

}
