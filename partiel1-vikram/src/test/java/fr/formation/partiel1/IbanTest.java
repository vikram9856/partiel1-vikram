package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IbanTest {

	@Test
	void testcodePaysStandardIsoIsNotNull() {

		int codePaysStandardIso = 0;
		Iban codePays = new Iban(codePaysStandardIso);
		
	}

}
