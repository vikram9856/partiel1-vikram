package fr.formation.partiel1;

public class Iban {
	String codePaysStandardIso;
	int cleDeControle;
	


	public Iban(String codePaysStandardIso, int cleDeControle) {
		this.codePaysStandardIso = codePaysStandardIso;
		this.cleDeControle = cleDeControle;
	}
	
	public String getCodePaysStandardIso() {
		return codePaysStandardIso;
	}

	public int getCleDeControle() {
		return cleDeControle;
	}
	

}


