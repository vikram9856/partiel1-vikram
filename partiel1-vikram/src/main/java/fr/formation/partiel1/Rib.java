package fr.formation.partiel1;

public class Rib{
	private int codeBanque;
	private int codeGuichet;
	private int numeroDeCompte;
	private int cleRib;

	
	public Rib(int codeBanque, int codeGuichet, int numeroDeCompte, int cleRib) {		
		this.codeBanque = codeBanque;
		this.codeGuichet = codeGuichet;
		this.numeroDeCompte = numeroDeCompte;
		this.cleRib = cleRib;
	}


	public int getCodeBanque() {
		return codeBanque;
	}


	public int getCodeGuichet() {
		return codeGuichet;
	}


	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}


	public int getCleRib() {
		return cleRib;
	}
	

}