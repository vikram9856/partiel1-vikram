package fr.formation.partiel1;

public class Iban {
	int codePaysStandardIso;
	int cleDeControle;
	


	public Iban(int codePaysStandardIso, int cleDeControle) {
		this.codePaysStandardIso = codePaysStandardIso;
		this.cleDeControle = cleDeControle;
	}
	
	public int getCodePaysStandardIso() {
		return codePaysStandardIso;
	}

	public int getCleDeControle() {
		return cleDeControle;
	}
	

}


